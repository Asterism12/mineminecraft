package Thing.Otherthing;

import Game.World;
import Thing.Square;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//熔炉类
public class Furnace extends Square {
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
