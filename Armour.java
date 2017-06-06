package Game;

public abstract class Armour extends Item {

	private String type;
	private int damage;
		
	public String getType() { return type; }
	public void setType(String newType) { type = newType; }

	public int getDamage() { return damage; }
	public void setDamage(int newDamage) { damage = newDamage; }
	
}