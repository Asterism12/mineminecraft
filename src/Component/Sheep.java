package Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sheep extends Animal{
    private static BufferedImage image;

    static{
        try {
            image = ImageIO.read(new FileInputStream("image/sheep.png"));
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

    public Sheep()
    {
        this.setAnimalName("Sheep");
        this.setHP(20);
        this.setAnimalName("Zombie");
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
