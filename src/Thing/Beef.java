package Thing;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//牛肉和所有肉类
public class Beef extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Beef.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Beef(){
		id=51;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
//鸡肉
class Chicken extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Chicken.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Chicken(){
		id=52;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
//猪肉
class Pork extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Pork.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Pork(){
		id=53;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}