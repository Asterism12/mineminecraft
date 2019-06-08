package Component.Animals;

import Game.World;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Skeleton extends OffensiveAnimal {
    private static BufferedImage image1Left,image1Right,image2Left,image2Right;

    static{
        try {//load the pics
            image1Left = ImageIO.read(new FileInputStream("image/skeLeft.png"));
            image1Right = ImageIO.read(new FileInputStream("image/skeRight.png"));
            image2Left = ImageIO.read(new FileInputStream("image/ske2Left.png"));
            image2Right = ImageIO.read(new FileInputStream("image/ske2Right.png"));
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

    public Skeleton(Point.Double location)
    {
        super(8.5/(double)(World.FPS));
        this.setLocationx(location.x);
        this.setLocationy(location.y);
        this.setHP(80);
        this.setAttackForce(15);
        this.setAnimalName("Skeleton");
        this.setLift(2);
        this.setImage(true,1,image1Left);
        this.setImage(false,1,image1Right);
        this.setImage(true,2,image2Left);
        this.setImage(false,2,image2Right);

    }
}
