
public class MiniBoss extends Monster{

	public MiniBoss(){
		exp = 10;
		hp = 20;
		attack = 6;
		money = 10;
	}
	
	public void appear() {
		// TODO Auto-generated method stub
		System.out.println("The Mini Boss("+type+") appeared!");
	}

	@Override
	protected Monster clone() {
		MiniBoss clone = null;
		clone = (MiniBoss)clone.clone();
		return clone;
	}
}

