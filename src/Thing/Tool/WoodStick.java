package Thing.Tool;

import Game.World;
import Thing.Square;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WoodStick extends Square {
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/WoodStick.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WoodStick() {
        id = 1;
        breakLevel = 1;
        weight = false;
        liquid = false;
        pile = true;
        food = false;
        takeUp = true;
        through = false;
        putDown = false;
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
}
