package Component.Animals;

import Game.World;
import Thing.Square;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Animal
{
    private String animalName = "";
    private int hp = 0;
    private double velocity;
    private double fallVelocity = 0.0;
    private BufferedImage image1,image2,image;
    private Point.Double location;  //the coordinates of the animal
    private boolean dir;  //true stands for left, false stands for right
    private boolean standing;
//    protected static Random random = new Random(System.currentTimeMillis());
//    protected static Timer moveTimer = new Timer();
//    protected static Timer dirTimer = new Timer();

    public Animal() {}

    public Animal(double volocity)
    {
        location = World.startLocation;
        this.velocity = volocity;
    }
    //The get and set methods for each attribute
    public String getAnimalName()
    {
        return animalName;
    }

    public void setAnimalName(String name)
    {
        animalName = name;
    }

    public int getHP()
    {
        return hp;
    }

    public void setHP(int HP)
    {
        this.hp = HP;
    }

    public void setImage1(BufferedImage image)
    {
        this.image1 = image;
    }

    public BufferedImage getImage1()
    {
        return image1;
    }

    public void setImage2(BufferedImage image)
    {
        this.image2 = image;
    }

    public BufferedImage getImage2()
    {
        return image2;
    }

    public Point.Double getLocation()
    {
        return location;
    }

    public void setDir(boolean dir)
    {
        this.dir = dir;
    }

    public boolean getDir()
    {
        return dir;
    }

    public double getVelocity()
    {
        return velocity;
    }

    public void setLocationx(double x)
    {
        this.location.x = x;
    }

    public void setLocationy(double y)
    {
        this.location.y = y;
    }

    public void setStanding(boolean standing)
    {
        this.standing = standing;
    }

    public boolean getStanding()
    {
        return standing;
    }

    public BufferedImage getImage()
    {
        if(standing)
            return image1;
        else
            return image2;
    }
//ImageIO.read(new FileInputStream(imagePath));
//    public static void main(String args[])
//    {
//        System.out.println("test123");
//    }
}
