package Thing;

import java.awt.Image;

public abstract class Square {
	int id;
	int break_level;
	protected Image pic;//世界生成中的图片
	protected Image toolBarPic;//背包中的图片
    public Image getPic(){
        return pic;
    }
    public Image getToolBarPic() {
        return toolBarPic;
    }
	static String realimgpath="src\\realimages";
	static String bagimgpath="src\\bagimages";
	
	boolean weight=false;//是否有重力
	boolean liquid=false;//是否是液体
	boolean pile=true;//是否能堆叠
	boolean food=false;//是否是事物
	boolean takeup=true;//是否能捡起
	boolean through=false;//是否能穿过
	boolean putdown=true;//是否能放下
}
