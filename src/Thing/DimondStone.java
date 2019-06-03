package Thing;

import javax.swing.ImageIcon;
//钻石矿类和所有钻石生成的物品
public class DimondStone extends Square{
	public DimondStone(){
		id=30;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondStone.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondStone.jpg").getImage();
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class Dimond extends Square{
	public Dimond(){
		id=31;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\Dimond.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\Dimond.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}

class DimondAxe extends Square{
	public DimondAxe(){
		id=32;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondAxe.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondAxe.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondPick extends Square{
	public DimondPick(){
		id=33;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondPick.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondPick.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondSpade extends Square{
	public DimondSpade(){
		id=34;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondSpade.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondSpade.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondSword extends Square{
	public DimondSword(){
		id=35;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondSword.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondSword.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondHelmet extends Square{
	public DimondHelmet(){
		id=36;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondHelmet.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondHelmet.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondChest extends Square{
	public DimondChest(){
		id=37;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondChest.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondChest.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondPants extends Square{
	public DimondPants(){
		id=38;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondPants.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondPants.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class DimondShoes extends Square{
	public DimondShoes(){
		id=39;
		breakLevel=4;
		pic=new ImageIcon(realimgpath+"\\DimondShoes.jpg").getImage();
		toolBarPic=new ImageIcon(bagimgpath+"\\DimondShoes.jpg").getImage();
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
