package Thing;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Sand extends Square{
    private static Image material;
    private static Image toolBarPicMaterial;
    static {
        try {
            material = ImageIO.read(new File("image/Sand.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Sand(){
        id=66;
        weight=false;
        liquid=false;
        pile=true;
        food=false;
        takeUp=true;
        through=false;
        putDown=true;
        digType = 3;
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
}
