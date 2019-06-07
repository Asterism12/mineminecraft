package Component.Animals;

import Component.Animals.Animal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Pig extends Animal {
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/pig.png"));
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

    public Pig()
    {
        this.setHP(24);
        this.setAnimalName("Pig");
        this.setImage1(image);
    }
}
