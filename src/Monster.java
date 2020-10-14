
public abstract class Monster {
	String name;
	int hp;

	//抽象クラスはnewによるインスタンス化ができない
	//run()を抽象メソッドとして宣言
	//歩くモンスターと飛ぶモンスターに分ける
	public abstract void run();
	//attack()を抽象メソッドとして宣言
	public abstract void attack();

}
