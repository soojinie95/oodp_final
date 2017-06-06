import java.util.Random;
public abstract class Monster implements Cloneable{
	protected int exp, hp, attack, money;
	protected String type;
	
	public Monster(){
		setType();
	}
	
	Random random = new Random();
	abstract void appear();
	
	public int getEXP(){
		return this.exp;
	}
	public int getHP(){
		return this.hp;
	}
	public int getAttack(){
		return this.attack;
	}
	public int getMoney(){
		return this.money;
	}
	public String getType(){
		return this.type;
	}
	public void setType(){
		switch(random.nextInt()%3){
		case 1:
			type = "water";
			break;
		case 2:
			type = "fire";
			break;
		default:
			type = "grass";
			break;
		}
	}
	protected abstract Monster clone();
}