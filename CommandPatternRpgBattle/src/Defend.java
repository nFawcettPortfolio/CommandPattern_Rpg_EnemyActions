public class Defend implements BattleCommand{
	private Enemy enemy;
	
	public Defend(Enemy enemy) {
		this.enemy=enemy;
	}
	public void execute() {
		enemy.defend();
	}
	
}
