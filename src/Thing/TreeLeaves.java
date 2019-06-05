package Thing;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//树叶类和其他乱七八糟的类
public class TreeLeaves extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/TreeLeaves.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public TreeLeaves(){
		id=61;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
//工作台类
class CraftingTable extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/CraftingTable.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public CraftingTable(){
		id=62;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
//熔炉类
class Furnace extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Furnace.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Furnace(){
		id=63;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
//泥土类
class Earth extends Square{
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
	public Earth(){
		id=64;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}