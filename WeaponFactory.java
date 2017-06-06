package Game;
/*
 *	Composite method (abstract class = super class)
 *	We throw UnsupportedOperationException so that if
 *	it doesn't make sense for a song, or song group
 *	to inherit a method they can just inherit the
 *	default implementation
 */

// Factory method

public class WeaponFactory extends Item{
	
	public Weapon makeWeapon(String newWeaponType) {
		
		//setItemType("Weapon");
		
		if (newWeaponType.equals("Fire")){
			return new Weapon_Fire();
		}
		else if (newWeaponType.equals("Water")){
			return new Weapon_Water();
		}
		else
			return new Weapon_Grass();
	}	
}
