
public class Werewolf extends WalkingMonster {
	public Werewolf() {//引数なしのコンストラクタを定義
		this.name = "名無しの狼";
		this.hp = 774;
	}
	public Werewolf(String name, int hp) {//コンストラクタを定義
		this.name = name;
		this.hp = hp;
	}
	//attack()の詳細を決める
	public void attack() {
		System.out.println(this.name + "は噛みついた！！");
	}

}
