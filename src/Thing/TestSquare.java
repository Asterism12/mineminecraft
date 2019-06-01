package Thing;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestSquare extends Square{//为测试渲染模块临时增加的类
    private Image pic;
    static Image material;
    static {
        try{
            material= ImageIO.read(new File("image/soil.jpg"))
                    .getScaledInstance(World.SIZE,World.SIZE, Image.SCALE_DEFAULT);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Image getPic() {
        return pic;
    }

    public TestSquare(){
        this.pic=material;
    }
}