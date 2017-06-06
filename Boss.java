
public class Boss extends Monster{

	public Boss(){
		exp = 20;
		hp = 40;
		attack = 12;
		money = 20;
	}

	public void appear() {
		// TODO Auto-generated method stub
		System.out.println("The Boss("+type+") appeared!");
	}

	@Override
	protected Monster clone() {
		Boss clone = null;
		clone = (Boss)clone.clone();
		return clone;
	}
}
