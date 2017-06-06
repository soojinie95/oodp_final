package Game;

public class test {

	public static void main(String[] args) {
		System.out.println("Enter the item you want: ");

		Item input = null;

		WeaponFactory factoryW = new WeaponFactory();
		input = factoryW.makeWeapon("Fire");
		
		input.display();
	}
}	