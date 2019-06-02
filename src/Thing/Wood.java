package Thing;

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
class Woodpanel extends Square{
	public Woodpanel(){
		id=6;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodpanel.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodpanel.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
class Woodstick extends Square{
	public Woodstick(){
		id=1;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodstick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodstick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Woodaxe extends Square{
	public Woodaxe(){
		id=2;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodaxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodaxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Woodpick extends Square{
	public Woodpick(){
		id=3;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodpick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodpick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Woodspade extends Square{
	public Woodspade(){
		id=4;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodspade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodspade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Woodsword extends Square{
	public Woodsword(){
		id=5;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Woodsword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Woodsword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}