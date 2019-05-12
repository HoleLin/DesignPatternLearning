package design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Staff
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Staff {
	private List<Command> mCommandList = new ArrayList<>();

	public void addCommand(Command command) {
		mCommandList.add(command);
	}

	public void executeCommands() {
		for (Command command : mCommandList) {
			command.execute();
		}
		mCommandList.clear();
	}
}
