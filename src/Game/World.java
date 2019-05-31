package Game;

import Thing.*;

import javax.swing.*;
import java.awt.*;

public class World {
    private static byte[] b = new byte[0];//线程缓冲区
    private static int seed = 0;
    static Square[][] worldSquare;//存储世界地形，世界应为256*4096的平面，指向Null的方块视为天空
    private static final int WEDTH = 52;//加载区块的数量
    private static final int HEIGHT = 42;
    private static JFrame frame;
    private static MCanvas mCanvas;

    static Player player;//玩家类

    private static void UIinit(int weith, int height) {//UI初始化
        frame = new JFrame();
        frame.setSize(weith, height);
        mCanvas = new MCanvas(weith, height);
        frame.add(mCanvas);
        frame.setVisible(true);
    }

    private static void worldSquareCreator() {//用种子生成一个世界地形，种子默认为0
        worldSquare = new Square[4096][256];
        for (int i = 0; i < 4096; i++) {
            for (int j = 128; j < 256; j++) {
                worldSquare[i][j] = new TestSquare();
            }
        }
    }

    private static void update() {//更新世界
        mCanvas.repaint();
    }

    static Rectangle checkBorder() {//判断哪些区块需要载入
        Point.Double playerLocation;
        Rectangle rectangle;
        synchronized (b) {
            playerLocation = player.location;
            rectangle = new Rectangle();
        }
        rectangle.x = (int) playerLocation.x - WEDTH/ 2;
        rectangle.y = (int) playerLocation.y - HEIGHT / 2;
        rectangle.height = HEIGHT;
        rectangle.width = WEDTH;
        return rectangle;
    }

    public static void worldCreator() {//世界创造器
        worldSquareCreator();
        player = new Player();
        UIinit(1000, 800);
    }

    public static void main(String[] args) {
        worldCreator();
    }
}
