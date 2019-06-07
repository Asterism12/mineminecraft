package Component.Animals;

import Game.World;
import Thing.Square;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Animal
{
    private String animalName = "";
    private int hp = 0;
    private double velocity;
    private double fallVelocity = 0.0;
    private BufferedImage image;
    private Point.Double location;  //the coordinates of the animal
    private boolean dir;  //true stands for left, false stands for right
    protected static Random random = new Random(System.currentTimeMillis());
    protected static Timer moveTimer = new Timer();
    protected static Timer dirTimer = new Timer();

    public Animal() {}

    public Animal(int volocity)
    {
        location = World.startLocation;
        this.velocity = volocity;
        dirTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                dir = (random.nextInt(10) + 1) % 2 == 1;
            }
        },0, 5*World.FPS);

        moveTimer.schedule(new TimerTask() {
            @Override
            public void run() {

                if(dir == true)
                {
                    double targetX = location.x - volocity;
                    Square square = World.worldSquare[(int) targetX][(int) location.y];

                    if(square == null)
                        location.x = targetX;
                    else if(!square.through)
                        location.x = Math.ceil(targetX);
                    else
                        location.x = targetX;
                }
                else
                {
                    double targetX = location.x + volocity;
                    Square square = World.worldSquare[(int)targetX][(int) location.y];

                    if(square == null)
                        location.x = targetX;
                    else if(!square.through)
                        location.x = (int) targetX - 0.01;
                    else
                        location.x = targetX;
                }

                if(World.worldSquare[(int)location.x][(int)location.y] == null)
                {
                    fallVelocity = 0.5;
                    double taretY = location.y + fallVelocity;
                    Square square = World.worldSquare[(int)location.x][(int)taretY];
                    if(fallVelocity > 0.0 && square != null && !square.through)
                    {
                        location.y = (int)taretY - 0.01; //avoid getting stuck in the dirt
                        fallVelocity = 0.0;
                    }
                    else
                    {
                        location.y = taretY;
                        if(fallVelocity <= 1)
                            fallVelocity += World.gravity;
                    }
                }
            }
        },0,World.FPS);
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

    public void setImage(BufferedImage img) throws IOException
    { this.image = img;}

    public BufferedImage getImage()
    {
        return this.image;
    }

    public Point.Double getLocation()
    {
        return location;
    }

//ImageIO.read(new FileInputStream(imagePath));
//    public static void main(String args[])
//    {
//        System.out.println("test123");
//    }
}
