
public class Fry extends Monster{

	public Fry(){
		exp = 5;
		hp = 10;
		attack = 3;
		money = 5;
	}

	public void appear() {
		// TODO Auto-generated method stub
		System.out.println("A Soldier Monster("+type+") appeared!");
	}

	@Override
	protected Monster clone() {
		Fry clone = null;
		clone = (Fry)clone.clone();
		return clone;
	}
	
	
}
