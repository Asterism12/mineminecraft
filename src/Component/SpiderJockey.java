package Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SpiderJockey extends Skeleton{
    private Spider spider = new Spider();
    private static BufferedImage image;

    static{
        try {
            image = ImageIO.read(new FileInputStream("image/spiderjockey.png"));
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

    public SpiderJockey()
    {
        super();
        this.setHP(100);
        this.setAttackForce(25);
        this.setAnimalName("SpiderJockey");
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
