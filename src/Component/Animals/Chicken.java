package Component.Animals;

import Component.Animals.Animal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Chicken extends Animal {
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/chicken.png"));
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

    public Chicken()
    {
        this.setHP(10);
        this.setAnimalName("Chicken");
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
