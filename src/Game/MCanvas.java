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
        g.drawImage(bg, 0, 0, null);
    }

    private void printWorld(Graphics g) {//渲染需要载入的区块
        Rectangle rectangle = World.checkBorder();
        Point.Double location = World.player.getLocation();
        int xbias, ybias;//人物相对于脚下物块的位置像素偏移量

        xbias = (int) ((location.x - (int) location.x) * World.SIZE);
        ybias = (int) ((location.y - (int) location.y) * World.SIZE);
        //ybias = (int) ((Math.ceil(location.y)-location.y) * World.SIZE);

        for (int i = 0; i < rectangle.width; i++) {
            for (int j = 0; j < rectangle.height; j++) {
                int x = i + rectangle.x;
                int y = j + rectangle.y;
                if (World.worldSquare[x][y] != null)
                    g.drawImage(World.worldSquare[x][y].getPic(),
                            World.SIZE * i - xbias, World.SIZE * j - ybias, null);
            }
        }
    }

    private void printPlayer(Graphics g) {//在屏幕正中心绘制玩家
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth() / 2 -10, this.getHeight() / 2 -10, 20, 20);
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
