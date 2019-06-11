package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DiamondPick extends Pick {
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/DiamondPick.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DiamondPick() {
        super();
        id = 33;
        durability = 4;
        animalAtk = 4;
        digLevel = 3;
        digSpeed = 5;
        pic = material;
        toolBarPic = toolBarPicMaterial;
    }
}
