package Game;

import javax.swing.*;

public class World {
    private static JFrame frame;
    private static void UIinit(int weith,int height){
        frame=new JFrame();
        frame.setSize(weith, height);
        MCanvas mCanvas=new MCanvas(weith,height);
        frame.add(mCanvas);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        UIinit(1000,800);
    }
}
