import hero.Hero;
import monster.Werewolf;

public class Main {

	public static void main(String[] args) {

		//インスタンス化
		Werewolf ww = new Werewolf("狼男", 150);
		Werewolf ww2 = new Werewolf();
		Hero h = new Hero("スラリン", 200);
		//テスト
		System.out.println("name:" + ww.name + "　hp:" + ww.hp);
		System.out.println("name:" + ww2.name + "　hp:" + ww2.hp);
		ww.attack(h);

	}

}
