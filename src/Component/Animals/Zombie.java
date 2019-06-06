package Component.Animals;

import Component.Animals.OffensiveAnimal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zombie extends OffensiveAnimal {
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/zombie.png"));
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

    public Zombie()
    {
        this.setHP(100);
        this.setAttackForce(10);
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
