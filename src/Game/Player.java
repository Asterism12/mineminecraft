package Game;

import java.awt.*;

public class Player {
    private int hp=10;
    private int vp=10;
    private Image head;
    private Image body;
    private Image arm;
    private Image leg;
    private Toolbar toolbar;
    public Point.Double location;//玩家脚底中心坐标，决定从何处开始渲染
    Player(){
        location=new Point.Double(128,2048);
    }
}
