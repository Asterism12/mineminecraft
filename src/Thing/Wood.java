package Thing;

import javax.swing.ImageIcon;

public class Wood extends Square{
	public Wood(){
		id=0;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=true;
		putDown=true;
	}
}
class WoodPanel extends Square{
	public WoodPanel(){
		id=6;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class WoodStick extends Square{
	public WoodStick(){
		id=1;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodAxe extends Square{
	public WoodAxe(){
		id=2;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodPick extends Square{
	public WoodPick(){
		id=3;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodSpade extends Square{
	public WoodSpade(){
		id=4;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class WoodSword extends Square{
	public WoodSword(){
		id=5;
		breakLevel=1;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}