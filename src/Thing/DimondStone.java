package Thing;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//钻石矿类和所有钻石生成的物品
public class DimondStone extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondStone.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondStone(){
		id=30;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class Dimond extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Dimond.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Dimond(){
		id=31;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}

class DimondAxe extends Weapon{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondAxe.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondAxe(){
		id=32;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=4;
		squareAtk=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondPick extends Weapon{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondPick.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondPick(){
		id=33;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=4;
		squareAtk=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondSpade extends Weapon{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondSpade.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondSpade(){
		id=34;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=4;
		squareAtk=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondSword extends Weapon{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondSpade.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondSword(){
		id=35;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=5;
		squareAtk=3;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondHelmet extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondHelmet.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondHelmet(){
		id=36;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondChest extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondChest.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondChest(){
		id=37;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondPants extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondPants.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondPants(){
		id=38;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
class DimondShoes extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DimondShoes.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DimondShoes(){
		id=39;
		breakLevel=4;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=4;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
