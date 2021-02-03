public class CastSpell implements BattleCommand{
	private Enemy enemy;
	
	public CastSpell(Enemy enemy) {
		this.enemy=enemy;
	}
	public void execute() {
		enemy.castSpell();
	}
	
}
