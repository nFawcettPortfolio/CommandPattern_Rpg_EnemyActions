
public class Main {
	public static void main(String[] args) {
		Enemy enemy = new Enemy();
		
		Attack attack = new Attack(enemy);
		Defend defend = new Defend(enemy);
		CastSpell spell = new CastSpell(enemy);
		
		Action action = new Action();
		action.takeCommand(attack);
		action.takeCommand(defend);
		action.takeCommand(spell);
		
		action.performCommand();
	}
}
