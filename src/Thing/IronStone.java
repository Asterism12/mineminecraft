package Thing;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IronStone extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronStone.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronStone(){
		id=20;
		breakLevel=3;
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
class IronIngot extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronIngot.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronIngot(){
		id=21;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronAxe extends Weapon{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronAxe.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronAxe(){
		id=22;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=3;
		squareAtk=3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronPick extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronPick.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronPick(){
		id=23;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronSpade extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronSpade.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronSpade(){
		id=24;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronSword extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronSword.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronSword(){
		id=25;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronHelmet extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronHelmet.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronHelmet(){
		id=26;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronChest extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronChest.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronChest(){
		id=27;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronPants extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronPants.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronPants(){
		id=28;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class IronShoes extends Armor{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/IronShoes.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public IronShoes(){
		id=29;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}