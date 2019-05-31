package Game;

import Thing.*;

import javax.swing.*;
import java.awt.*;

public class MCanvas extends JPanel {
    private final Point size = new Point(20, 20);//图片默认大小

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());//使用底色清屏
        printBackGround(g);
        //g.drawImage(TestSquare.material,20, 20, null);
        printWorld(g);
        printPlayer(g);
    }

    private void printBackGround(Graphics g) {//渲染背景

    }

    private void printWorld(Graphics g) {//渲染需要载入的区块
        Rectangle rectangle;
        Point.Double location;
        int bias;//人物相对于脚下物块的位置像素偏移量
        synchronized (this) {
            rectangle = World.checkBorder();
            location = World.player.location;
        }
        bias = (int) (location.x - (double) ((int) location.x))*20;
        //g.drawImage(TestSquare.material,20, 20, null);

        for (int i = 0; i < rectangle.x; i++) {
            for (int j = 0; j < rectangle.y; j++) {
                g.drawImage(TestSquare.material,
                        20 * i - bias, 20 * j, null);
            }
        }
    }

    private void printPlayer(Graphics g) {//在屏幕正中心绘制玩家
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth() / 2 - 5, this.getWidth() / 2 - 5, 10, 10);
    }

    MCanvas(int width, int height) {
        this.setSize(width, height);
    }
}
