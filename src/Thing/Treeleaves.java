package Thing;

import javax.swing.ImageIcon;
//��Ҷ����������߰������
public class Treeleaves extends Square{
	public Treeleaves(){
		id=61;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Treeleaves.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Treeleaves.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=false;
		through=false;
		putdown=false;
	}
}
//����̨��
class Workplatform extends Square{
	public Workplatform(){
		id=62;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Workplatform.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Workplatform.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=false;
		through=false;
		putdown=false;
	}
}
//��¯��
class Smelter extends Square{
	public Smelter(){
		id=63;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Smelter.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Smelter.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=false;
		through=false;
		putdown=false;
	}
}
//������
class Earth extends Square{
	public Earth(){
		id=64;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\Earth.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Earth.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeup=false;
		through=false;
		putdown=false;
	}
}