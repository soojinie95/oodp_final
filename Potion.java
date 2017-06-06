package Game;

public class Potion extends Item {
	
	private int damage;
	private int hp;
		
	public int getDamage() { return damage; }
	public void setDamage(int newDamage) { damage = newDamage; }

	public int getHp() { return hp; }
	public void setHp(int newHp) { hp = newHp; }
}
