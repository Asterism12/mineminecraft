package Thing.Weapon;

import Game.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DimondPick extends Weapon {
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
