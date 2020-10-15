package monster;
public class Goblin extends WalkingMonster{
	public Goblin(String name, int hp) {//コンストラクタを定義
		this.name = name;
		this.hp = hp;
	}
	public void attack() {
		System.out.println(this.name + "はナイフで切りかかった！");
	}

}
