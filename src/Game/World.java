package Game;

import Thing.*;

import Thing.Otherthing.BedRock;
import Thing.Otherthing.Earth;
import Thing.Otherthing.Ground;
import Thing.Otherthing.TreeLeaves;
import Thing.ore.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World {
    private static int seed = 0;
    final static double gravity = 0.08;//重力常数
    static Square[][] worldSquare;//存储世界地形，世界应为4096*256的平面，指向Null的方块视为天空
    private static final int WIDTH = 52;//不触碰地图边界时，加载区块的数量
    private static final int HEIGHT = 42;
    private static JFrame frame;//UI组件
    private static MCanvas mCanvas;

    static Player player;//玩家类
    static Point.Double startLocation=new Point.Double(2048, 127.99);

    public static final int PICSIZE = 20;//图片默认边长;
    public static final int TOOLBARSPICIZE = 42;//工具栏中的图片默认边长
    //public static final int FPS=1000;//测试帧率1FPS，在测试监听器时应先采用此帧率测试
    public static final int FPS = 1000 / 30;//定时器触发间隔

    private static void UIinit(int weith, int height) {//UI初始化
        frame = new JFrame();
        frame.setSize(weith, height);
        mCanvas = new MCanvas(weith - 22, height - 56);
        frame.add(mCanvas);
        frame.setCursor(Cursor.CROSSHAIR_CURSOR);
        frame.setVisible(true);
    }
    //用种子生成一个世界地形，种子默认为0
    private static void worldSquareCreator() {
        worldSquare = new Square[4096][256];
        int i=0,j=0;


        //生成土壤同时随机生成树，山
        int groundLine=136;
        int stoneLine=groundLine+8,treePoint=6,changePoint=16,minePoint=32;
        for(i=0;i<=4000;i++){

            int earthChange=(int)(Math.random()*81)+1;
            if(earthChange==4){ stoneLine++;groundLine++; }
            else if(earthChange==3){ stoneLine--;groundLine--;}
            if(i==changePoint){
                int change=(int)(Math.random()*11);
                if(change==0);
                else if(change<=4){
                    int length=(int)(Math.random()*8)+8;
                    createSand(i,groundLine,minePoint,length,worldSquare);
                    i += length - 1;
                }
                else {
                    int length=(int)(Math.random()*36)+6;
                    createHill(i, groundLine, treePoint, minePoint, length, worldSquare);
                    i += length - 1;
                }
                treePoint=i+6;
                minePoint=i+12;
                changePoint=i+(int)(Math.random()*16)+20;
                continue;
            }
            else if(i==treePoint){
                createTree(i,groundLine,(int)(Math.random()*3)+3,worldSquare);
                treePoint+=(int)(Math.random()*8)+8;
            }
            else worldSquare[i][groundLine]=new Ground();
            for(j=groundLine+1;j<stoneLine;j++){
                int changeStone=(int)(Math.random()*8)+groundLine;
                if(j>changeStone)worldSquare[i][j]=new Stone();
                else worldSquare[i][j]=new Earth();
            }
            if(i==minePoint){
                int mineLength=stoneLine+8;
                for(j=stoneLine;j<=240;j++){
                    if(mineLength==j) {
                        int mineSort=(int)(Math.random()*5);
                        int mineDepth = (int) (Math.random() * 6) + 6;
                        if (mineSort == 0) createDimondMine(i - 1 - mineDepth, j,mineDepth,worldSquare );
                        else createMine(i - 1 - mineDepth, j,mineDepth,worldSquare );
                        mineLength+=mineDepth;
                        mineLength+=(int)(Math.random()*12)+20;
                    }
                    worldSquare[i][j]=new Stone();
                }
                minePoint+=(int)(Math.random()*12)+12;
            }
            else for(j=stoneLine;j<=240;j++)worldSquare[i][j]=new Stone();
        }
        //出不去的屏障，边界设置为4080,240
        i=0;
        j=0;
        while(i<=4000)worldSquare[i++][0]=new BedRock();
        while(j<=240)worldSquare[0][j++]=new BedRock();
        while(i>0)worldSquare[--i][240]=new BedRock();
        while(j>0)worldSquare[4000][--j]=new BedRock();
    }
    private static void createTree(int x,int y,int high,Square[][] worldSquare){//生成树
        int halfLength=high/2,width=high;//树叶的半长和高
        int i,j;
        worldSquare[x][y]=new Earth();
        for(i=1;i<=high;i++)worldSquare[x][y-i]=new Wood();
        for(j=high+1;j<high+width;j++){
            for(i=-halfLength;i<=halfLength;i++)worldSquare[x+i][y-j]=new TreeLeaves();
        }
        if(width>3&&j==high+width)for(i=-halfLength+1;i<=halfLength-1;i++)worldSquare[x+i][y-j]=new TreeLeaves();
    }
    private static void createHill(int x,int y,int treePoint,int minePoint,int length,Square[][] worldSquare){//生成山
        int highAdd=1;
        if(length>=30)highAdd=2;
        int high=length/2,groundLine=y,stoneLine=y+8;
        int i,j;
        for(i=0;i<=length;i++) {
            if (i<length/4) groundLine-=highAdd;
            else if (i>length*3/4) groundLine+=highAdd;
            if(i+x==treePoint){
                World.createTree(i+x,groundLine,(int)(Math.random()*3)+3,worldSquare);
                treePoint+=(int)(Math.random()*8)+8;
            }
            else worldSquare[i+x][groundLine]=new Ground();
            for(j=groundLine+1;j<stoneLine;j++){
                int changeStone=(int)(Math.random()*8)+groundLine;
                if(j>changeStone)worldSquare[i+x][j]=new Stone();
                else worldSquare[i+x][j]=new Earth();
            }
            if(i+x==minePoint){
                int mineLength=stoneLine+12;
                for(j=stoneLine;j<=240;j++){
                    if(mineLength==j) {
                        int mineSort=(int)(Math.random()*5);
                        int mineDepth = (int) (Math.random() * 6) + 6;
                        if (mineSort == 0) createDimondMine(i+x - 1 - mineDepth, j,mineDepth,worldSquare );
                        else createMine(i+x - 1 - mineDepth, j,mineDepth,worldSquare );
                        mineLength+=mineDepth;
                        mineLength+=(int)(Math.random()*12)+20;
                    }
                    worldSquare[i+x][j]=new Stone();
                }
                minePoint+=(int)(Math.random()*12)+12;
            }
            else for(j=stoneLine;j<=240;j++)worldSquare[i+x][j]=new Stone();
        }
    }
    private static void createSand(int x,int y,int minePoint,int length,Square[][] worldSquare){//生成沙堆
        int i,j,sandLine=y,stoneLine=y+8;
        int earthChange=(int)(Math.random()*10)+1;
        if(earthChange==4){ stoneLine++;sandLine++; }
        else if(earthChange==3){ stoneLine--;sandLine--;}
        for(i=0;i<length;i++){
            for(j=sandLine;j<stoneLine;j++){
                int changeStone=(int)(Math.random()*8)+sandLine;
                if(j>changeStone)worldSquare[i+x][j]=new Stone();
                else worldSquare[i+x][j]=new Sand();
            }
            if(i+x==minePoint){
                int mineLength=stoneLine+12;
                for(j=stoneLine;j<=240;j++){
                    if(mineLength==j) {
                        int mineSort=(int)(Math.random()*5);
                        int mineDepth = (int) (Math.random() * 6) + 6;
                        if (mineSort == 0) createDimondMine(i+x - 1 - mineDepth, j,mineDepth,worldSquare );
                        else createMine(i+x - 1 - mineDepth, j,mineDepth,worldSquare );
                        mineLength+=mineDepth;
                        mineLength+=(int)(Math.random()*12)+20;
                    }
                    worldSquare[i+x][j]=new Stone();
                }
                minePoint+=(int)(Math.random()*12)+12;
            }
            else for(j=stoneLine;j<=240;j++)worldSquare[i+x][j]=new Stone();
        }
    }
    private static void createMine(int x,int y,int high,Square[][] worldSquare){//生成铁矿，夹杂石头
        int i,j;
        for(j=0;j<high;j++){
            for(i=0;i<high;i++){
                int judge=(int)(Math.random()*2);
                if(judge==0)worldSquare[x+i][y-j]=new Stone();
                else worldSquare[x+i][y-j]=new IronStone();
            }
        }
    }
    private static void createDimondMine(int x,int y,int high,Square[][] worldSquare){//生成钻石矿，夹杂铁矿、石头
        int i,j;
        for(j=0;j<high;j++){
            for(i=0;i<high;i++){
                int judge=(int)(Math.random()*5);
                if(judge==0)worldSquare[x+i][y-j]=new Stone();
                else if(judge<=2)worldSquare[x+i][y-j]=new IronStone();
                else worldSquare[x+i][y-j]=new DimondStone();
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
        //按空格键跳跃，按E打开背包,按Q扔（摧）出（毁）手中的方块
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()) {
                    case 65:
                        player.walkLeft = 1;
                        break;
                    case 68:
                        player.walkRight = 1;
                        break;
                    case 32:
                        player.isJumping = true;
                        break;
                    case 69:
                        player.isOpenBag = !player.isOpenBag;
                        break;
                    case 48:
                        player.setHandSquare(9);
                        break;
                    case 81:
                        player.throwOutSquare();
                        break;
                    default:
                        if (e.getKeyCode() >= 49 && e.getKeyCode() <= 58)
                            player.setHandSquare(e.getKeyCode() - 49);
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

        rectangle.x = (int) playerLocation.x - WIDTH / 2 + 1;
        rectangle.y = (int) playerLocation.y - HEIGHT / 2 + 1;
        if (rectangle.x < 0) rectangle.x = 0;
        if (rectangle.y < 0) rectangle.y = 0;

        if (rectangle.x + WIDTH < 4096)
            rectangle.width = WIDTH;
        else
            rectangle.width = 4096 - rectangle.x;

        if (rectangle.y + HEIGHT < 256)
            rectangle.height = HEIGHT;
        else
            rectangle.height = 256 - rectangle.y;
        return rectangle;
    }

    public static void worldCreator() {//世界创造器
        worldSquareCreator();
        player = new Player();
        UIinit(1022, 856);
        playerUpdater();
        worldUpdater();

        //test
        player.getToolbar().pickUp(new TestSquare());
        player.getToolbar().testUP(new TestSquare(), 10);
    }

    public static void main(String[] args) {
        worldCreator();
    }
}
