package assignments.command_pattern;

public class GoBackward implements Command{
    @Override
    public void execute() {
        Robot.go_backward();
    }
}
