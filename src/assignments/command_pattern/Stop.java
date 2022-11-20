package assignments.command_pattern;

public class Stop implements Command{
    @Override
    public void execute() {
        Robot.stop();
    }
}
