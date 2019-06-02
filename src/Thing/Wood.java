package thing;

import javax.swing.ImageIcon;

public class Wood extends Square{
	public Wood(){
		id=0;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Wood.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Wood.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
class WoodPanel extends Square{
	public WoodPanel(){
		id=6;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodPanel.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodPanel.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
class WoodStick extends Square{
	public WoodStick(){
		id=1;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodStick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodStick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class WoodAxe extends Square{
	public WoodAxe(){
		id=2;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodAxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodAxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class WoodPick extends Square{
	public WoodPick(){
		id=3;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodPick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodPick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class WoodSpade extends Square{
	public WoodSpade(){
		id=4;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodSpade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodSpade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class WoodSword extends Square{
	public WoodSword(){
		id=5;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WoodSword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodSword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}