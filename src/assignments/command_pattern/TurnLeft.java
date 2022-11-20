package assignments.command_pattern;

public class TurnLeft implements Command{
    @Override
    public void execute() {
        Robot.turn_left();
    }
}
