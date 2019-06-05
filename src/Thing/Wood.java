package Thing;

import Game.World;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Wood extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/Wood.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Wood(){
		id=0;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=true;
		putDown=true;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
class WoodPanel extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodPanel.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodPanel(){
		id=6;
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
class WoodStick extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodStick.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodStick(){
		id=1;
		breakLevel=1;
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
class WoodAxe extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodAxe.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodAxe(){
		id=2;
		breakLevel=1;
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
class WoodPick extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodPick.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodPick(){
		id=3;
		breakLevel=1;
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
class WoodSpade extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodSpade.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodSpade(){
		id=4;
		breakLevel=1;
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
class WoodSword extends Square{
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/WoodSword.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WoodSword(){
		id=5;
		breakLevel=1;
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