package thing;

import javax.swing.ImageIcon;
//��Ҷ����������߰������
public class TreeLeaves extends Square{
	public TreeLeaves(){
		id=61;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\TreeLeaves.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\TreeLeaves.jpg").getImage();
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
class WorkPlatform extends Square{
	public WorkPlatform(){
		id=62;
		break_level=1;
		pic=new ImageIcon(realimgpath+"\\WorkPlatform.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\WorkPlatform.jpg").getImage();
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