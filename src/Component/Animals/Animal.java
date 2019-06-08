package Component.Animals;

import Game.World;
import Thing.Square;

import javax.xml.stream.Location;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Animal
{
    private String animalName = "";
    private int hp = 0;
    private double velocity;
    private BufferedImage image1Left,image2Left,image1Right,image2Right;    //the pics of the animal
    private Point.Double location = new Point.Double();  //the coordinates of the animal
    private boolean dir;  //true stands for left, false stands for right
    private boolean standing;   //where the animal is standing or not(standing or walking)
    private boolean walking;
    private double lift; //when drawn on the canvas according to the location, the animal should be lifted about lift*PICSIZE to be properly shown

    public Animal() {}

    public Animal(double volocity)
    {
        this.velocity = volocity;
        dir = true;
        standing = true;
        walking = true;
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

    public BufferedImage getImage()
    {
        if(standing) {
            if(dir == true)
                return image1Left;
            else if(dir == false)
                return image1Right;
        }
        else if(!standing) {
            if(dir == true)
                return image2Left;
            else if(dir == false)
                return image2Right;
        }
        return null;
    }

    public void setImage(boolean dir,int seq,BufferedImage image)
    {
        if(dir == true)
        {
            if(seq == 1)
                this.image1Left = image;
            if(seq == 2)
                this.image2Left = image;
        }
        else
        {
            if(seq == 1)
                this.image1Right = image;
            if(seq == 2)
                this.image2Right = image;
        }
    }

    public boolean getDir()
    {
        return dir;
    }

    public void setDir(boolean dir)
    {
        this.dir = dir;
    }

    public double getVelocity()
    {
        return velocity;
    }

    public Point.Double getLocation()
    {
        return location;
    }

    public void setLocationx(double x)
    {
        this.location.x = x;
    }

    public void setLocationy(double y)
    {
        this.location.y = y;
    }

    public boolean getStanding()
    {
        return standing;
    }

    public void setStanding(boolean standing)
    {
        this.standing = standing;
    }

    public boolean getWalking()
    {
        return walking;
    }

    public void setWalking(boolean walking)
    {
        this.walking = walking;
    }

    public double getLift()
    {
        return lift;
    }

    public void setLift(double lift)
    {
        this.lift = lift;
    }

}
