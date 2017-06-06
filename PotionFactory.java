package Game;

public class PotionFactory {
	
	public Potion makePotion(String newPotionType) {
		if (newPotionType.equals("Hp")){
			return new Potion_Damage();
		}
		else
			return new Potion_Hp();
		
	}
	
}