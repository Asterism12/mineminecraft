package Game;

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
    }

    private void printBackGround(Graphics g) {//渲染背景
        g.drawImage(bg,0,0,null);
    }

    private void printWorld(Graphics g) {//渲染需要载入的区块
        Rectangle rectangle;
        Point.Double location;
        int xbias,ybias;//人物相对于脚下物块的位置像素偏移量
        synchronized (this) {
            rectangle = World.checkBorder();
            location = World.player.location;
        }
        xbias = (int) (location.x - (double) ((int) location.x)) * 20;
        ybias = (int) (location.y - (double) ((int) location.y)) * 20;

        for (int i = 0; i < rectangle.width; i++) {
            for (int j = 0; j < rectangle.height; j++) {
                int x = i + rectangle.x;
                int y = j + rectangle.y;
                if (World.worldSquare[x][y] != null)
                    g.drawImage(World.worldSquare[x][y].getPic(),
                            World.SIZE * i - xbias, World.SIZE * j-ybias, null);
            }
        }
    }

    private void printPlayer(Graphics g) {//在屏幕正中心绘制玩家
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth() / 2 -5, this.getHeight() / 2 -5, 10, 10);
    }

    MCanvas(int width, int height) {
        this.setSize(width, height);
        try {
            this.bg= ImageIO.read(new File("image/sky.jpg")).getScaledInstance(width,height,Image.SCALE_DEFAULT);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
