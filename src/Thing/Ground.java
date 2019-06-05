package Thing;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ground extends Square{
    private static Image material;
    private static Image toolBarPicMaterial;
    static {
        try {
            material = ImageIO.read(new File("image/Ground.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Ground(){
        id=0;
        breakLevel=1;
        weight=false;
        liquid=false;
        pile=true;
        food=false;
        takeUp=true;
        through=false;
        putDown=true;
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
}
