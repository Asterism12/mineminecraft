package Thing;

import javax.swing.ImageIcon;
//牛肉和所有肉类
public class Beef extends Square{
	public Beef(){
		id=51;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
//鸡肉
class Chicken extends Square{
	public Chicken(){
		id=52;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
//猪肉
class Pork extends Square{
	public Pork(){
		id=53;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=true;
		takeUp=true;
		through=false;
		putDown=false;
	}
}