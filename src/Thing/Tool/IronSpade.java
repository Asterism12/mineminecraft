package Thing.Tool;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IronSpade extends Spade {
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
		super();
		id=24;
		durability = 3;
		animalAtk = 3;
		digSpeed = 3;
		this.pic = material;
		this.toolBarPic = toolBarPicMaterial;
	}
}
