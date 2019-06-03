package Game;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Player {
    private final double walkSpeed = 16/(double)(World.FPS);//一秒16格
    private final double jumpSpeed = 0.5 ;//初始跳跃速度
    private double verticalSpeed = 0;//实时垂直速度
    private int hp = 10;
    private int vp = 10;
    private int dp = 0;//defensive power
    private Image head;
    private Image body;
    private Image arm;
    private Image leg;
    private Toolbar toolbar=new Toolbar();
    private Point.Double location;//玩家脚底中心坐标，决定从何处开始渲染

    int walkLeft = 0;//玩家是否在向左侧移动
    int walkRight = 0;//玩家是否在向右侧移动
    boolean isJumping = false;//玩家是否在跳跃

    synchronized Point.Double getLocation() {
        return location;
    }


    public synchronized void setHp(int hp) {
        this.hp = hp;
    }

    public synchronized int getHp() {
        return hp;
    }

    public synchronized int getDp() {
        return dp;

    public Toolbar getToolbar(){
        return toolbar;

    }

    Player() {
        location = new Point.Double(2048, 127.99);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //walk
                int walk = walkRight - walkLeft;
                if (walk == -1) {
                    double targetX = location.x - walkSpeed;
                    if (World.worldSquare[(int) targetX][(int) location.y] == null)
                        location.x = targetX;
                    else {
                        location.x =Math.ceil(targetX);
                    }
                } else if (walk == 1) {
                    double targetX = location.x + walkSpeed;
                    if (World.worldSquare[(int) targetX][(int) location.y] == null)
                        location.x = targetX;
                    else {
                        location.x = (int)targetX-0.01;//防止被卡在墙里
                    }
                }

                //jump
                if (isJumping && verticalSpeed == 0){//准备起跳
                    verticalSpeed = -jumpSpeed;
                }
                else if (verticalSpeed!=0||World.worldSquare[(int)location.x][(int)(location.y)]==null) {
                    double targetY = location.y + verticalSpeed;
                    if (verticalSpeed < 0 && World.worldSquare[(int) location.x][(int) targetY] != null) {//磕脑袋
                        location.y = Math.ceil(targetY);
                        verticalSpeed = 0;
                    } else if (verticalSpeed > 0 && World.worldSquare[(int) location.x][(int) targetY] != null) {//落地
                        location.y = (int) targetY-0.01;//防止陷到地里出不来了
                        verticalSpeed = 0;
                    } else {
                        location.y = targetY;
                        verticalSpeed += World.gravity;
                    }
                }
            }
        }, 0, World.FPS);
    }
}
