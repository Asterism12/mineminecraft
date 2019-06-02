package Thing;

import javax.swing.ImageIcon;
//木炭和炭类
public class Charcoal extends Square{
	public Charcoal(){
		id=41;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Charcoal.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Charcoal.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
//煤炭
class Coal extends Square{
	public Coal(){
		id=42;
		breakLevel=2;
		pic=new ImageIcon(realimgpath+"\\Coal.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Coal.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
