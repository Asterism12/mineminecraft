package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WoodSword extends Sword {
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
		super();
		id=5;
		durability = 1;
		animalAtk = 3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
