package Game;

import javax.swing.*;

public class World {
    private static int seed=233;
    private static Square[][] worldSquare;//存储世界地形，世界应为256*4096的平面
    private static JFrame frame;
    private static void UIinit(int weith,int height){//UI初始化
        frame=new JFrame();
        frame.setSize(weith, height);
        MCanvas mCanvas=new MCanvas(weith,height);
        frame.add(mCanvas);
        frame.setVisible(true);
    }
    private static void WorldCreator(){//用种子生成一个世界，种子默认为233

    }
    public static void CreateWorld(){//世界创造器
        WorldCreator();
        UIinit(1000,800);
    }
    public static void main(String[] args) {
        UIinit(1000,800);
    }
}
