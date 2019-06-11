package Thing.Tool;

import Game.World;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DiamondAxe extends Axe {
	private static Image material;
	private static Image toolBarPicMaterial;
	static {
		try {
			material = ImageIO.read(new File("image/DiamondAxe.png"))
					.getScaledInstance(World.PICSIZE, World.PICSIZE, Image.SCALE_DEFAULT);
			toolBarPicMaterial = material.getScaledInstance(
					World.TOOLBARSPICIZE, World.TOOLBARSPICIZE, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DiamondAxe(){
		super();
		id=32;
		durability = 4;
		animalAtk = 4;
		digSpeed = 5;
		pic = material;
		toolBarPic = toolBarPicMaterial;
	}
}
