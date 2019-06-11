package Thing.Ore;

import Game.World;
import Thing.Square;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//钻石矿类
public class DiamondOre extends Square {
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/DiamondStone.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DiamondOre() {
        id = 30;
        breakLevel = 2;
        weight = false;
        liquid = false;
        pile = true;
        food = false;
        takeUp = true;
        through = false;
        putDown = true;
        digType = 1;
        pic = material;
        toolBarPic = toolBarPicMaterial;
    }
}
