package assignments.command_pattern;

public class Main {
    public static void main(String[] args) {
        Command walkForward = new WalkForward();
        Command stop = new Stop();
        Command turnLeft = new TurnLeft();
        Command turnRight = new TurnRight();
        Command goBackward = new GoBackward();

        CommandHandler commandHandler = new CommandHandler();

        commandHandler.takeCommand(walkForward);
        commandHandler.takeCommand(stop);
        commandHandler.takeCommand(goBackward);
        commandHandler.takeCommand(turnRight);
        commandHandler.takeCommand(turnLeft);

        commandHandler.placeCommand();
    }
}
