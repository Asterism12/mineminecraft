package Thing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestSquare extends Square{
    //为测试渲染模块临时增加的类
    static {
        try{
            material= ImageIO.read(new File("image/soil.jpg"))
                    .getScaledInstance(20,20, Image.SCALE_DEFAULT);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
