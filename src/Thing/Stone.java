package Thing;

import javax.swing.ImageIcon;

public class Stone extends Square{
	public Stone(){
		id=10;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\Stone.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Stone.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class BedRock extends Square{
	public BedRock(){
		id=11;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\BedRock.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\BedRock.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}

class StoneAxe extends Square{
	public StoneAxe(){
		id=12;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\StoneAxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\StoneAxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class StonePick extends Square{
	public StonePick(){
		id=13;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\StonePick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\StonePick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class StoneSpade extends Square{
	public StoneSpade(){
		id=14;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\StoneSpade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\StoneSpade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class StoneSword extends Square{
	public StoneSword(){
		id=15;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\StoneSword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\StoneSword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}