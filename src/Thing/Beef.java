package Thing;

import javax.swing.ImageIcon;
//牛肉和所有肉类
public class Beef extends Square{
	public Beef(){
		id=51;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Beef.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Beef.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
//鸡肉
class Chicken extends Square{
	public Chicken(){
		id=52;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Chicken.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Chicken.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
//猪肉
class Pork extends Square{
	public Pork(){
		id=53;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Pork.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Pork.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
//腐肉
class Slough extends Square{
	public Slough(){
		id=54;
		breakLevel=1;
		pic=new ImageIcon(realimgpath+"\\Slough.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Slough.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=true;
	}
}