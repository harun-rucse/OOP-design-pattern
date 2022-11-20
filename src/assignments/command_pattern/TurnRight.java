package assignments.command_pattern;

public class TurnRight implements Command{
    @Override
    public void execute() {
        Robot.turn_right();
    }
}
