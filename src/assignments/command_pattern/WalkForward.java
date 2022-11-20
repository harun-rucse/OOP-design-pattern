package assignments.command_pattern;

public class WalkForward implements Command{
    @Override
    public void execute() {
        Robot.walk_forward();
    }
}
