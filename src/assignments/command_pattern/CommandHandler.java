package assignments.command_pattern;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler {
    private List<Command> commandList = new ArrayList<Command>();

    public void takeCommand(Command command) {
        commandList.add(command);
    }

    public void placeCommand() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
