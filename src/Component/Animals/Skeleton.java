package Component.Animals;

import Component.Animals.OffensiveAnimal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Skeleton extends OffensiveAnimal {
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/skeleton.png"));
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

    public Skeleton()
    {
        this.setHP(80);
        this.setAttackForce(16);
        this.setAnimalName("Skeleton");
        try {
            this.setImage(image);
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
}
