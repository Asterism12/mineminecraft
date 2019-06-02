package Thing;

import javax.swing.ImageIcon;

public class Stone extends Square{
	public Stone(){
		id=10;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stone.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stone.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
class Bedrock extends Square{
	public Bedrock(){
		id=16;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Bedrock.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Bedrock.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
class Stonestick extends Square{
	public Stonestick(){
		id=11;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stonestick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stonestick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Stoneaxe extends Square{
	public Stoneaxe(){
		id=12;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stoneaxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stoneaxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Stonepick extends Square{
	public Stonepick(){
		id=13;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stonepick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stonepick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Stonespade extends Square{
	public Stonespade(){
		id=14;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stonespade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stonespade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}
class Stonesword extends Square{
	public Stonesword(){
		id=15;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Stonesword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stonesword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=true;
		through=false;
		putdown=false;
	}
}