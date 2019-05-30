package Game;

import javax.swing.*;
import java.awt.*;

public class MCanvas extends JPanel {
    Point.Double playerLocation=new Point.Double(0,0);//玩家脚底中心坐标，决定从何处开始渲染
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(0,20,this.getWidth(),this.getHeight());//使用底色清屏
        printPlayer(g);
    }

    private void printWorld(Graphics g){

    }
    private void printPlayer(Graphics g){//在屏幕正中心绘制玩家
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth()/2-3,this.getWidth()/2-3,6,6);
    }
    MCanvas(int width,int height){
        this.setSize(width,height);
    }
}
