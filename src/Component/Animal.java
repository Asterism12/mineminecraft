package Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Animal
{
    private String animalName = "";
    private int hp = 0;
    private Boolean isOffensive = false;
    private BufferedImage image;


    public Animal() { }
    //The get and set methods for each attribute
    public String getAnimalName()
    {
        return animalName;
    }

    public void setAnimalName(String name)
    {
        animalName = name;
    }

    public Boolean getIsOffensive()
    {
        return isOffensive;
    }

    public void setIsOffensive(Boolean isOffensive)
    {
        this.isOffensive = isOffensive;
    }

    public int getHP()
    {
        return hp;
    }

    public void setHP(int HP)
    {
        this.hp = HP;
    }

    public void setImage(BufferedImage img) throws FileNotFoundException, IOException
    { this.image = img;}
//ImageIO.read(new FileInputStream(imagePath));
//    public static void main(String args[])
//    {
//        System.out.println("test123");
//    }
}
