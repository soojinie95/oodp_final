package Game;

public class ArmourFactory {

	public Armour makeArmour(String newArmourType) {
		if (newArmourType.equals("Fire")){
			return new Armour_Fire();
		}
		else if (newArmourType.equals("Water")){
			return new Armour_Water();
		}
		else
			return new Armour_Grass();
	}
}