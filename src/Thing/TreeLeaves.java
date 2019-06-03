package Thing;

import javax.swing.ImageIcon;
//树叶类和其他乱七八糟的类
public class TreeLeaves extends Square{
	public TreeLeaves(){
		id=61;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
	}
}
//工作台类
class CraftingTable extends Square{
	public CraftingTable(){
		id=62;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
	}
}
//熔炉类
class Furnace extends Square{
	public Furnace(){
		id=63;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
	}
}
//泥土类
class Earth extends Square{
	public Earth(){
		id=64;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=false;
		through=false;
		putDown=false;
	}
}