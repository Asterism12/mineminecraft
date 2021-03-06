package Thing.Food;

import Game.World;
import Thing.Square;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Pork extends Square {
    private static Image material;
    private static Image toolBarPicMaterial;
    static {
        try {
            material = ImageIO.read(new File("image/Pork.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Pork(){
        id=53;
        weight=false;
        liquid=false;
        pile=false;
        food=true;
        takeUp=true;
        through=false;
        putDown=false;
        pic = material;
        toolBarPic = toolBarPicMaterial;
    }
}
