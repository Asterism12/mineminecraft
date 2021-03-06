package Component.Animals;

import Component.Animals.OffensiveAnimal;
import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zombie extends OffensiveAnimal {
    private static BufferedImage image1Left; //pic of standing to the left
    private static BufferedImage image1Right;   //pic of standing to the righr
    private static BufferedImage image2Left;    //pic of walking to the left
    private static BufferedImage image2Right;   //pic of walking to the right

    static{
        try {//load the pics
            image1Left = ImageIO.read(new FileInputStream("image/zomLeft.png"));
            image1Right = ImageIO.read(new FileInputStream("image/zomRight.png"));
            image2Left = ImageIO.read(new FileInputStream("image/zom2Left.png"));
            image2Right = ImageIO.read(new FileInputStream("image/zom2Right.png"));
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

    public Zombie(Point.Double location)
    {
        super(8.5/(double)(World.FPS));
        this.setLocationx(location.x);
        this.setLocationy(location.y);
        this.setHP(100);
        this.setAttackForce(10);
        this.setAnimalName("Zombie");
        this.setLift(2);
        this.setImage(true,1,image1Left);
        this.setImage(false,1,image1Right);
        this.setImage(true,2,image2Left);
        this.setImage(false,2,image2Right);

    }
}
