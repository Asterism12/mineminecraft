<<<<<<< HEAD
package Thing;
=======
package thing;
>>>>>>> 5fa8f7312dcf9972cab155fe22ca0370e2f94368

import javax.swing.ImageIcon;
//Ä¾Ì¿ºÍÌ¿Àà
public class Charcoal extends Square{
	public Charcoal(){
		id=41;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Charcoal.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Charcoal.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
//ÃºÌ¿
class Coal extends Square{
	public Coal(){
		id=42;
		break_level=2;
		pic=new ImageIcon(realimgpath+"\\Coal.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Coal.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeup=true;
		through=false;
		putdown=true;
	}
}
