package Component.Animals;

import Component.Animals.OffensiveAnimal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Spider extends OffensiveAnimal {
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/spider.png"));
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

    public Spider()
    {
        this.setHP(20);
        this.setAttackForce(3);
        this.setAnimalName("Spider");
        //this.setImage1(image);

    }
}
