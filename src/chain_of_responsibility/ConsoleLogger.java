package chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int label) {
        this.label = label;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard console::logger: " + message);
    }
}
