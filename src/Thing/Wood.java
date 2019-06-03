package Thing;

import javax.swing.ImageIcon;

public class Wood extends Square{
	public Wood(){
		id=0;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Wood.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Wood.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=true;
		putDown=true;
	}
}
class WoodPanel extends Square{
	public WoodPanel(){
		id=6;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodPanel.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodPanel.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class WoodStick extends Square{
	public WoodStick(){
		id=1;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodStick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodStick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodAxe extends Square{
	public WoodAxe(){
		id=2;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodAxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodAxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodPick extends Square{
	public WoodPick(){
		id=3;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodPick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodPick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodSpade extends Square{
	public WoodSpade(){
		id=4;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodSpade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodSpade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodSword extends Square{
	public WoodSword(){
		id=5;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\WoodSword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WoodSword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}