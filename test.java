
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonsterFactory mf = new MonsterFactory();
		Monster monster = null;
		for(int i = 0; i < 10; i++){
			monster = mf.getMonster();
			monster.appear();
		}
	}

}
