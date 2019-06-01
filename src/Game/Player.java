package Game;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Player {
    private final double walkSpeed = ((double) World.SIZE) / World.FPS * 4;//一秒走4格
    private final double jumpSpeed=10;//初始跳跃速度
    private double verticalSpeed=0;//实时垂直速度
    private int hp = 10;
    private int vp = 10;
    private Image head;
    private Image body;
    private Image arm;
    private Image leg;
    private Toolbar toolbar;
    private Point.Double location;//玩家脚底中心坐标，决定从何处开始渲染

    int walklLeft = 0;//玩家是否在向左侧移动
    int walkRight=0;//玩家是否在向右侧移动
    boolean isJumping = false;//玩家是否在跳跃

    boolean isOnGround() {
        if (location.y == (int) location.y)
            if (!World.worldSquare[(int) location.x][(int) location.y].through)
                return true;
        return false;
    }

    synchronized Point.Double getLocation() {
        return location;
    }

    Player() {
        location = new Point.Double(2048, 128);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //walk
                int walk=walkRight-walklLeft;
                if (walk == -1) {
                    location.x = location.x - walkSpeed;
                } else if (walk == 1) {
                    location.x = location.x + walkSpeed;
                }

                /*
                //jump
                if (isJumping&&isOnGround())//准备起跳
                    verticalSpeed=10;
                else if(!isOnGround()){

                }
                 */
            }
        }, 0, World.FPS);
    }
}
