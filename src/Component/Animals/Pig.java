package Component.Animals;

import Component.Animals.Animal;
import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Pig extends Animal {
    private static BufferedImage image1Left; //pic of standing to the left
    private static BufferedImage image1Right;   //pic of standing to the righr
    private static BufferedImage image2Left;    //pic of walking to the left
    private static BufferedImage image2Right;   //pic of walking to the right

    static{
        try {
            image1Left = ImageIO.read(new FileInputStream("image/pigLeft.png"));
            image1Right = ImageIO.read(new FileInputStream("image/pigRight.png"));
            image2Left = ImageIO.read(new FileInputStream("image/pig2Left.png"));
            image2Right = ImageIO.read(new FileInputStream("image/pig2Right.png"));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Pig(Point.Double location)
    {
        super( 7.3/(double) (World.FPS));
        this.setLocationx(location.x);
        this.setLocationy(location.y);
        this.setHP(20);
        this.setAnimalName("Pig");
        this.setLift(1);
        this.setImage(true,1,image1Left);
        this.setImage(false,1,image1Right);
        this.setImage(true,2,image2Left);
        this.setImage(false,2,image2Right);
    }
}
