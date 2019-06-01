package Game;

import Thing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World {
    private static int seed = 0;
    static Square[][] worldSquare;//存储世界地形，世界应为4096*256的平面，指向Null的方块视为天空
    private static final int WIDTH = 52;//加载区块的数量
    private static final int HEIGHT = 42;
    private static JFrame frame;//UI组件
    private static MCanvas mCanvas;

    static Player player;//玩家类

    public static final int SIZE = 20;//图片默认边长;
    //public static final int FPS=1000;//测试帧率1FPS，在测试监听器时应先采用此帧率测试
    public static final int FPS = 1000 / 40;//帧率

    private static void UIinit(int weith, int height) {//UI初始化
        frame = new JFrame();
        frame.setSize(weith, height);
        mCanvas = new MCanvas(weith-22, height-56);
        frame.add(mCanvas);
        frame.setCursor(Cursor.CROSSHAIR_CURSOR);
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

    private static void worldUpdater() {
        ActionListener update = new ActionListener() {//刷新世界
            @Override
            public void actionPerformed(ActionEvent e) {
                mCanvas.repaint();
            }
        };
        new Timer(FPS, update).start();
    }

    private static void playerUpdater() {
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == 65) {
                    player.walkLeft = 1;
                } else if (e.getKeyCode() == 68) {
                    player.walkRight = 1;
                } else if (e.getKeyCode() == 32) {
                    player.isJumping = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == 65) {
                    player.walkLeft = 0;
                } else if (e.getKeyCode() == 68) {
                    player.walkRight = 0;
                } else if (e.getKeyCode() == 32) {
                    player.isJumping = false;
                }
            }
        });
    }

    static Rectangle checkBorder() {//判断哪些区块需要载入
        Point.Double playerLocation = player.getLocation();
        Rectangle rectangle = new Rectangle();

        rectangle.x = (int) playerLocation.x - WIDTH / 2+1;
        rectangle.y = (int) playerLocation.y - HEIGHT / 2+1;
        rectangle.height = HEIGHT;
        rectangle.width = WIDTH;
        return rectangle;
    }

    public static void worldCreator() {//世界创造器
        worldSquareCreator();
        player = new Player();
        UIinit(1022, 856);
        playerUpdater();
        worldUpdater();
    }

    public static void main(String[] args) {
        worldCreator();
    }
}
