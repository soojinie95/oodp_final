package Game;

import java.util.Iterator;

public class User {
	private static User user;
	private static boolean theUserAvailable = true;
	
	private static final int MAX_EXP = 3;
	private static final int MAX_LEVEL = 5;
	private String name, type;
	private int level, exp, hp, maxhp, attackpoint, money;
	private ItemList inventory = new ItemList();
	
	private User() {}
	
	//Design Pattern: Singleton
	public static User getUser(String name) {
		if(theUserAvailable) {
			theUserAvailable = false;
			initiallizeUser(name);
			return user;
		}
		else {
			return null;
		}
	}

	private static void initiallizeUser(String name) {
		if(user == null)
			user = new User();
		user.name = name;
		user.type = "none";
		user.level = 1;
		user.exp = 0;
		user.maxhp = user.hp = 30;
		user.attackpoint = 10;
		user.money = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMaxhp() {
		return maxhp;
	}
	
	public int getAttackpoint() {
		return attackpoint;
	}
	
	public int getMoney() {
		return money;
	}
	
	private void setType(String type) {
		//check if type is valid
		this.type = type;
	}
	
	private void levelUp() {
		if(++level == MAX_LEVEL) {
			//ending
		}
		exp = 0;
		maxhp += 10;
		hp = maxhp;
		attackpoint += 5;
	}
	
	public void expUp() {
		if(++exp == MAX_EXP) {
			levelUp();
		}
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
	
	public void setAttackpoint(int attackpoint) {
		this.attackpoint = attackpoint;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showStatus() {
		System.out.println("=======Status=======");
		System.out.println("Level: " + level + "/" + MAX_LEVEL);
		System.out.println("  EXP: " + exp + "/" + MAX_EXP);
		System.out.println("  DMG: " + attackpoint);
		System.out.println("   HP: " + hp + "/" + maxhp);
		System.out.println(" Type: " + type);
		System.out.println("Money: " + money + " Golds");
		System.out.println("====================");
	}
	
	public void showEquipped() {
		System.out.println("======Equipped======");
		Iterator<Item> iterator = inventory.iterator();
		while(iterator.hasNext()){
			Item item = iterator.next();
			if(item.isEquipped)
				System.out.println(item.name);
		}
		System.out.println("====================");
	}
	
	public void showInventory() {
		System.out.println("======Inventory======");
		Iterator<Item> iterator = inventory.iterator();
		while(iterator.hasNext()){
			Item item = iterator.next();
			if(!item.isEquipped)
				System.out.println(item.name);
		}
		System.out.println("=====================");
	}
	
}
