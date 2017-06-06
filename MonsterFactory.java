public class MonsterFactory {
	static int called = 0;
	public MonsterFactory(){
	}
	public Monster getMonster(){
		called = (called+1)%6;
		switch(called){
		case 3:
			return new MiniBoss();
		case 0:
			return new Boss();
		default:
			return new Fry();
		}
	}
	
}
