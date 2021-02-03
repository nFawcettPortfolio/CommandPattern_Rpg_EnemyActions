import java.util.ArrayList;
import java.util.List;

public class Action {
	private List<BattleCommand> commandList = new ArrayList<BattleCommand>();
	public void takeCommand(BattleCommand command) {
		commandList.add(command);
	}
	public void performCommand() {
		for (BattleCommand command : commandList) {
			command.execute();
		}
		commandList.clear();
	}
}
