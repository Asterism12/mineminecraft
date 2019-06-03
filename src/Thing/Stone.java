package Thing;

import javax.swing.ImageIcon;

public class Stone extends Square{
	public Stone(){
		id=10;
		breakLevel=2;
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
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}