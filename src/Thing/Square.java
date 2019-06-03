package Thing;

import java.awt.Image;

public abstract class Square {
    public int id;
    public int breakLevel;
    protected Image pic;//世界生成中的图片
    protected Image toolBarPic;//背包中的图片
    public Image getPic(){
        return pic;
    }
    public Image getToolBarPic() {
        return toolBarPic;
    }

    public boolean weight=false;//是否有重力
    public boolean liquid=false;//是否是液体
    public boolean pile=true;//是否能堆叠
    public boolean food=false;//是否是事物
    public boolean takeUp=true;//是否能捡起
    public boolean through=false;//是否能穿过
    public boolean putDown=true;//是否能放下
}
class Weapon extends Square{
    public int animalAtk=1;
    public int squareAtk=1;
}
class Armor extends Square{
    public int defense=1;
}