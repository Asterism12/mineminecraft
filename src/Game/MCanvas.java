package Game;

import Thing.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MCanvas extends JPanel {
    private Image bg;//背景图片

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        printBackGround(g);
        printWorld(g);
        printPlayer(g);
        printToolbar(g);
        if (World.player.isOpenBag)
            printBag(g);
        printLocation(g);
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

    private void printPlayer(Graphics g) {//在屏幕正中心绘制玩家
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth() / 2 - 10, this.getHeight() / 2 - 20, 20, 20);
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

        Square[] squares = World.player.getToolbar().getSquares();
        for (int i = 0; i < 10; i++) {//绘制工具
            if (squares[i] != null)
                g.drawImage(squares[i].getToolBarPic(),
                        margins + i * sideLength + 3, getHeight() - 100 + 3, null);
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

        Square[] squares = World.player.getToolbar().getSquares();
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (squares[i * 10 + j] != null)
                    g.drawImage(squares[i * 10 + j].getToolBarPic(),
                            margins + j * sideLength + 3, 500 + (i - 1) * sideLength + 3, null);
            }
        }
    }

    private void printLocation(Graphics g) {
        String s=String.format("[%.2f,%.2f]",World.player.getLocation().x,World.player.getLocation().y);
        g.setColor(Color.BLACK);
        g.drawString(s, 20, 20);
    }

    MCanvas(int width, int height) {
        this.setSize(width, height);
        try {
            this.bg = ImageIO.read(new File("image/sky.jpg")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
