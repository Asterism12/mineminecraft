package Game;

import Thing.Square;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Player {
    private final double walkSpeed = 16 / (double) (World.FPS);//一秒16格
    private final double jumpSpeed = 0.5;//初始跳跃速度
    private double verticalSpeed = 0;//实时垂直速度
    private int hp = 10;
    private int vp = 10;
    private int dp = 0;//防御力
    private Toolbar toolbar = new Toolbar();
    private Square handSquare;
    private int handSquareNO = 0;
    private Point.Double location;//玩家脚底中心坐标，决定从何处开始渲染
    private boolean isLegSwing = true;

    Color head = Color.WHITE;
    Color body = Color.WHITE;
    Color arm = Color.WHITE;
    Color leg = Color.WHITE;

    int legSwing = 0;//腿部摆动的角度
    int walkLeft = 0;//玩家是否在向左侧移动
    int walkRight = 0;//玩家是否在向右侧移动
    boolean isJumping = false;//玩家是否在跳跃
    boolean isOpenBag = false;//玩家是否在查看背包

    public synchronized void throwOutSquare() {
        toolbar.getSquares()[handSquareNO] = null;
    }

    public synchronized int getHandSquareNO() {
        return handSquareNO;
    }

    public synchronized Square getHandSquare() {
        return handSquare;
    }

    public synchronized void setHandSquare(int i) {
        this.handSquare = toolbar.getSquares()[i];
        handSquareNO = i;
    }

    public synchronized Point.Double getLocation() {
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
    }

    public synchronized int getLegSwing() {
        return legSwing;
    }

    Toolbar getToolbar() {
        return toolbar;
    }

    private synchronized void setLegSwing() {
        if (isLegSwing) {
            legSwing += 1;
            if (legSwing == 6)
                isLegSwing = false;
        } else {
            legSwing -= 1;
            if (legSwing == 0)
                isLegSwing = true;
        }
    }

    Player() {
        location = World.startLocation;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //walk
                int walk = walkRight - walkLeft;
                if (walk == -1) {
                    double targetX = location.x - walkSpeed;
                    Square square = World.worldSquare[(int) targetX][(int) location.y];
                    if (square == null)
                        location.x = targetX;
                    else {
                        if (!square.through)
                            location.x = Math.ceil(targetX);
                        else
                            location.x = targetX;
                    }
                } else if (walk == 1) {
                    double targetX = location.x + walkSpeed;
                    Square square = World.worldSquare[(int) targetX][(int) location.y];
                    if (square == null)
                        location.x = targetX;
                    else {
                        if (!square.through)
                            location.x = (int) targetX - 0.01;//防止被卡在墙里
                        else
                            location.x = targetX;
                    }
                }
                if (walk != 0 || getLegSwing() != 0) {
                    setLegSwing();
                }


                //jump
                if (isJumping && verticalSpeed == 0) {//准备起跳
                    verticalSpeed = -jumpSpeed;
                } else if (verticalSpeed != 0 || World.worldSquare[(int) location.x][(int) (location.y)] == null) {
                    double targetY = location.y + verticalSpeed;
                    Square square = World.worldSquare[(int) location.x][(int) (targetY)];
                    if (verticalSpeed < 0 && square != null && !square.through) {//磕脑袋
                        location.y = Math.ceil(targetY);
                        verticalSpeed = 0;
                    } else if (verticalSpeed > 0 && square != null && !square.through) {//落地
                        location.y = (int) targetY - 0.01;//防止陷到地里出不来了
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
