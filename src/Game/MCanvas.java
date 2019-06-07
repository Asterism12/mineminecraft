package Game;

import Component.AnimalState.AnimalState;
import Component.Animals.Animal;
import Thing.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.crypto.dsig.Transform;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MCanvas extends JPanel {
    private Image bg;//背景图片
    private Timer imgTimer = new Timer();
    private BufferedImage image;
    private boolean standing;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        printBackGround(g);
        printWorld(g);
        printPlayer(g);
        printToolbar(g);
        printAnimal(g);
        if (World.player.isOpenBag)
            printBag(g);
        printLocation(g);
        g.setColor(Color.CYAN);
        if (World.player.isShowBorder)
            printPlayerBorder(g);
    }

    private void printPlayerBorder(Graphics g) {
        g.drawRect(getWidth() / 2 - 50, getHeight() / 2 - 70, 100, 100);
    }

    private void printBackGround(Graphics g) {//渲染背景
        g.drawImage(bg, 0, 0, null);
    }

    private void printWorld(Graphics g) {//渲染需要载入的区块
        Rectangle rectangle = World.checkBorder();
        Point.Double location = World.player.getLocation();
        int xbias, ybias;//人物相对于脚下物块的位置像素偏移量

        xbias = (int) ((location.x - (int) location.x) * World.PICSIZE);
        ybias = (int) ((location.y - (int) location.y) * World.PICSIZE);

        for (int i = 0; i < rectangle.width; i++) {
            for (int j = 0; j < rectangle.height; j++) {
                int x = i + rectangle.x;
                int y = j + rectangle.y;
                if (World.worldSquare[x][y] != null)
                    g.drawImage(World.worldSquare[x][y].getPic(),
                            World.PICSIZE * i - xbias, World.PICSIZE * j - ybias, null);
            }
        }
    }

    private void printPlayer(Graphics g) {//在屏幕正中心绘制玩家，玩家占2格，碰撞箱只有脚底的点
        Point p = new Point(getWidth() / 2, getHeight() / 2);
        drawPlayer(g, p, 1);
    }

    private void drawPlayer(Graphics g, Point p, double size) {//地图中的玩家size为1
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        mouseLocation.x = mouseLocation.x + World.canvasLocation.x;
        mouseLocation.y = mouseLocation.y + World.canvasLocation.y;
        Point bodyLocation = new Point(p.x, p.y - (int) (26 * size));
        Point legLocation = new Point(p.x, p.y - (int) (10 * size));
        Graphics2D g2d = (Graphics2D) g;
        double x = mouseLocation.x - bodyLocation.x;
        double y = mouseLocation.y - bodyLocation.y;
        double theta;
        if (y == 0)
            theta = 0;
        else if (y > 0)
            theta = -Math.asin(x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        else
            theta = -(Math.PI - Math.asin(x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))));

        g2d.setColor(World.player.head);
        g2d.fillRect(p.x - (int) (5 * size), p.y - (int) (38 * size), (int) (10 * size), (int) (10 * size));

        g2d.setColor(World.player.body);
        g2d.fillRect(p.x - (int) (4 * size), p.y - (int) (28 * size), (int) (8 * size), (int) (18 * size));

        g2d.setColor(World.player.arm);
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.rotate(theta, bodyLocation.x, bodyLocation.y);
        g2d.setTransform(affineTransform);
        g2d.fill(new Rectangle2D.Double(p.x - (int) (3 * size), p.y - (int) (26 * size), (int) (6 * size), (int) (14 * size)));

        //The code sucks, I know.
        g2d.setColor(World.player.leg);
        AffineTransform affineTransform1 = new AffineTransform();
        affineTransform1.rotate(10 * World.player.getLegSwing() * Math.PI / 180, legLocation.x, legLocation.y);
        g2d.setTransform(affineTransform1);
        g2d.fill(new Rectangle2D.Double(p.x - (int) (3 * size), p.y - (int) (10 * size), (int) (6 * size), (int) (10 * size)));
        AffineTransform affineTransform2 = new AffineTransform();
        affineTransform2.rotate(-10 * World.player.getLegSwing() * Math.PI / 180, legLocation.x, legLocation.y);
        g2d.setTransform(affineTransform2);
        g2d.fill(new Rectangle2D.Double(p.x - (int) (3 * size), p.y - (int) (10 * size), (int) (6 * size), (int) (10 * size)));
        AffineTransform affineTransform3 = new AffineTransform();
        g2d.setTransform(affineTransform3);
    }

    private void printToolbar(Graphics g) {
        int sideLength = (int) (this.getHeight() * 0.06);
        int margins = (getWidth() - sideLength * 10) / 2;
        g.setColor(new Color(0, 0, 0, 128));//半透明工具栏
        g.fillRect(margins, getHeight() - 100, sideLength * 10, sideLength);

        g.setColor(Color.GRAY);
        for (int i = 0; i < 10; i++) {//画边
            g.drawRect(margins + i * sideLength, getHeight() - 100, sideLength, sideLength);
        }

        int NO = World.player.getHandSquareNO();
        g.setColor(Color.CYAN);
        g.drawRect(margins + NO * sideLength + 1, getHeight() - 100 + 1,
                sideLength - 2, sideLength - 2);

        g.setColor(Color.WHITE);
        Square[] squares = World.player.getToolbar().getSquares();
        int[] number = World.player.getToolbar().getNumber();
        for (int i = 0; i < 10; i++) {//绘制工具
            if (squares[i] != null) {
                g.drawImage(squares[i].getToolBarPic(),
                        margins + i * sideLength + 3, getHeight() - 100 + 3, null);
                if (number[i] > 1) {
                    g.drawString(String.valueOf(number[i]),
                            margins + i * sideLength, getHeight() - 100 - 3 + sideLength);
                }
            }
        }
    }

    private void printBag(Graphics g) {
        int sideLength = (int) (this.getHeight() * 0.06);
        int margins = (getWidth() - sideLength * 10) / 2;
        g.setColor(new Color(0, 0, 0, 128));//半透明背包
        g.fillRect(margins, 500, sideLength * 10, sideLength * 4);

        g.setColor(Color.GRAY);
        for (int i = 0; i < 4; i++) {//画边
            for (int j = 0; j < 10; j++) {
                g.drawRect(margins + j * sideLength,
                        500 + i * sideLength, sideLength, sideLength);
            }
        }

        g.setColor(Color.WHITE);
        int[] number = World.player.getToolbar().getNumber();
        Square[] squares = World.player.getToolbar().getSquares();
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (squares[i * 10 + j] != null) {
                    g.drawImage(squares[i * 10 + j].getToolBarPic(),
                            margins + j * sideLength + 3, 500 + (i - 1) * sideLength + 3, null);
                    if (number[i * 10 + j] > 1)
                        g.drawString(String.valueOf(number[i * 10 + j]),
                                margins + j * sideLength, 500 + i * sideLength - 3);
                }

            }
        }

        //人物信息栏
        g.setColor(new Color(0, 0, 0, 128));
        g.fillRect(margins, 300, 200, sideLength * 4);

        g.setColor(Color.GRAY);
        for (int i = 0; i < 4; i++) {//画边
            g.drawRect(margins, 300 + i * sideLength, sideLength, sideLength);
        }
        for (int i = 0; i < 4; i++) {
            if (squares[50 + i] != null)
                g.drawImage(squares[50 + i].getToolBarPic(),
                        margins + 3, 300 + i * sideLength + 3, null);
        }

        Point p = new Point(margins + 120, 470);
        drawPlayer(g, p, 4);

        //工作台
        g.setColor(new Color(0, 0, 0, 128));
        g.fillRect(margins + 230, 300, getWidth() - 2 * margins - 230, sideLength * 4);

        g.setColor(Color.GRAY);
        for (int i = 0; i < 3; i++) {//画边
            for (int j = 0; j < 3; j++) {
                g.drawRect(margins + 250 + j * sideLength,
                        325 + i * sideLength, sideLength, sideLength);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (squares[54 + 3 * i + j] != null)
                    g.drawImage(squares[54 + 3 * i + j].getToolBarPic(),
                            margins + 250 + j * sideLength + 3, 325 + i * sideLength + 3, null);
            }
        }

        g.drawRect(margins + 410, 325 + sideLength, sideLength, sideLength);
        g.setColor(Color.WHITE);
        if (squares[63] != null) {
            g.drawImage(squares[63].getToolBarPic(),
                    margins + 410 + 3, 325 + sideLength + 3, null);
            if (number[63] > 1)
                g.drawString(String.valueOf(number[63]),
                        margins + 410, 325 + 2 * sideLength - 3);
        }
        g.drawString("Input", margins + 235, 310);
        g.drawString("Output", margins + 410, 310 + sideLength);
    }

    private void printLocation(Graphics g) {
        String s = String.format("[%.2f,%.2f]", World.player.getLocation().x, World.player.getLocation().y);
        g.setColor(Color.BLACK);
        g.drawString(s, 20, 20);
    }

    private void printAnimal(Graphics g)
    {
        ArrayList<Animal> animals = AnimalState.getAnimalList();
        for(int i = 0;i < animals.size();i++)
        {
            Animal animal = animals.get(i);
            standing = true;
            Point.Double location = animal.getLocation();

            imgTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int xbias, ybias;//人物相对于脚下物块的位置像素偏移量
                    xbias = (int) ((location.x - (int) World.player.getLocation().x));
                    ybias = (int) ((location.y - (int) World.player.getLocation().y));

                    if(Math.abs(xbias) <= 500 && Math.abs(ybias) <= 400) {
                        if(standing) {
                            g.drawImage(animal.getImage1(),xbias,ybias,null);
                            standing = false;
                        }
                        else
                        {
                            g.drawImage(animal.getImage2(),xbias,ybias,null);
                            standing = true;
                        }
                    }
                }
            },0,5*World.FPS);


        }
    }

    private boolean checkClikcBorder(Point p) {//在可触碰范围内
        return p.x > getWidth() / 2 - 50 && p.x < getWidth() / 2 + 50 &&
                p.y > getHeight() / 2 - 70 && p.y < getHeight() / 2 + 30;
    }

    int getGrid(Point p) {
        int sideLength = (int) (this.getHeight() * 0.06);
        int margins = (getWidth() - sideLength * 10) / 2;
        if (p.x < margins || p.x > getWidth() - margins)
            return -1;

        //工作台
        if (p.x > margins + 250 && p.x < margins + 250 + 3 * sideLength) {
            if (p.y > 325 && p.y < 325 + 3 * sideLength) {
                int x = (p.x - margins - 250) / sideLength;
                int y = (p.y - 325) / sideLength;
                return 54 + x + 3 * y;
            }
        }
        if (p.x > margins + 410 && p.x < margins + 410 + sideLength) {
            if (p.y > 325 + sideLength && p.y < 325 + 2 * sideLength)
                return 63;
        }

        //背包
        int x = (p.x - margins) / sideLength;
        if (p.y > getHeight() - 100 + sideLength)
            return -1;
        if (p.y > getHeight() - 100) {
            return x;
        }

        //工具栏
        if (p.y > 500 && p.y < 500 + 4 * sideLength) {
            int y = (p.y - 500) / sideLength;
            return x + 10 * (y + 1);
        }

        //护具
        if (p.y > 300 && p.y < 300 + 4 * sideLength) {
            int y = (p.y - 300) / sideLength;
            return 50 + y;
        }

        return -1;
    }

    Point getClickSquare(Point p) {
        if (!checkClikcBorder(p))
            return null;

        Rectangle rectangle = World.checkBorder();
        Point.Double location = World.player.getLocation();
        int xbias, ybias;//人物相对于脚下物块的位置像素偏移量
        xbias = (int) ((location.x - (int) location.x) * World.PICSIZE);
        ybias = (int) ((location.y - (int) location.y) * World.PICSIZE);

        int x = (p.x + xbias) / World.PICSIZE + rectangle.x;
        int y = (p.y + ybias) / World.PICSIZE + rectangle.y;

        return new Point(x, y);
    }

    MCanvas(int width, int height) {
        this.setSize(width, height);
        try {
            this.bg = ImageIO.read(new File
                    ("image/sky.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
