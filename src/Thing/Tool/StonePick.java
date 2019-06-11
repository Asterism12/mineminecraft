package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StonePick extends Pick {
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/StonePick.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StonePick() {
        super();
        id = 13;
        digLevel = 1;
        digSpeed = 2;
        durability = 2;
        animalAtk = 2;
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
}
