package Thing;

import Game.MCanvas;
import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestSquare extends Square {//为测试渲染模块临时增加的类
    private static Image material;
    private static Image toolBarPicMaterial;

    static {
        try {
            material = ImageIO.read(new File("image/Earth.png"))
                    .getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
            toolBarPicMaterial = material.getScaledInstance(
                    World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public TestSquare() {
        this.pic = material;
        this.toolBarPic = toolBarPicMaterial;
    }
    public Image getPic() {
        return pic;
    }

    public Image getToolBarPic() {
        return toolBarPic;
    }


}
