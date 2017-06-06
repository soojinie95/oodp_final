package Game;

public class Item {
	
	private String name;
	private int cost;
	private int amount;
		
	public void setName(String newName) { name = newName; }	
	public String getName() { return name; }
	
	public void setCost(int newCost) { cost = newCost; }
	public int getCost() { return cost; }

	public int getAmount() { return amount; }
	public void setAmount(int newAmount) { amount = newAmount; }
	
	public void display(){
		System.out.println(getName() + " " + getCost() + " ");
	}
}