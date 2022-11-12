package chain_of_responsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int label) {
        this.label = label;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error console::logger: " + message);
    }
}
