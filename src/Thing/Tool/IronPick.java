package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IronPick extends Pick {
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/IronPick.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IronPick() {
        super();
        id = 23;
        durability = 3;
        animalAtk = 3;
        digLevel = 2;
        digSpeed = 3;
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
}
