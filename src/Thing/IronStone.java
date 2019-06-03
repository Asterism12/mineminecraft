package Thing;

import javax.swing.ImageIcon;

public class IronStone extends Square{
	public IronStone(){
		id=20;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=true;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class IronIngot extends Square{
	public IronIngot(){
		id=21;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=true;
	}
}
class IronAxe extends Weapon{
	public IronAxe(){
		id=22;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		animalAtk=3;
		squareAtk=3;
	}
}
class IronPick extends Square{
	public IronPick(){
		id=23;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class IronSpade extends Square{
	public IronSpade(){
		id=24;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class IronSword extends Square{
	public IronSword(){
		id=25;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
	}
}
class IronHelmet extends Armor{
	public IronHelmet(){
		id=26;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
	}
}
class IronChest extends Armor{
	public IronChest(){
		id=27;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
	}
}
class IronPants extends Armor{
	public IronPants(){
		id=28;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
	}
}
class IronShoes extends Armor{
	public IronShoes(){
		id=29;
		breakLevel=3;
		weight=false;
		liquid=false;
		pile=false;
		food=false;
		takeUp=true;
		through=false;
		putDown=false;
		defense=3;
	}
}