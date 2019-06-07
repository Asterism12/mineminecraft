package Component.Animals;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TimerTask;

public class Cow extends Animal{
    private static BufferedImage image1,image2;
    private static java.util.Timer imgTimer = new java.util.Timer();
    static{
        try {
            image1 = ImageIO.read(new FileInputStream("image/cow.png"));
            image2 = ImageIO.read(new FileInputStream("image/cow2.png"));
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

        super(16 / (double) (World.FPS));
        this.setHP(24);
        this.setAnimalName("Cow");
        this.setImage1(image1);
        this.setImage2(image2);
    }
}
