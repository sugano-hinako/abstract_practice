package monster;
public abstract class FlyingMonster extends Monster {
	public void run() {
		System.out.println(this.name + "は飛んで逃げ出した！");
	}

}
