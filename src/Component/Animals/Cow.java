package Component.Animals;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cow extends Animal{
    private static BufferedImage image;
    static{
        try {
            image = ImageIO.read(new FileInputStream("image/cow.png"));
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

    public Cow()
    {
        super();
        this.setHP(24);
        this.setAnimalName("Cow");
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