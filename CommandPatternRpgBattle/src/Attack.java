public class Attack implements BattleCommand{
	private Enemy enemy;
	
	public Attack(Enemy enemy) {
		this.enemy=enemy;
	}
	public void execute() {
		enemy.attack();
	}
	
}
