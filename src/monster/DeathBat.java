package monster;


public class DeathBat extends FlyingMonster{
	public DeathBat(String name, int hp) {//コンストラクタを定義
		this.name = name;
		this.hp = hp;
	}
	public void attack() {
		System.out.println(this.name + "は突撃してきた！");
	}

}
