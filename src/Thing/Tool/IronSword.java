package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IronSword extends Sword {
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
		super();
		id=25;
		durability = 3;
		animalAtk = 7;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
