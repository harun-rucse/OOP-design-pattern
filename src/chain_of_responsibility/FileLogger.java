package chain_of_responsibility;

public class FileLogger extends AbstractLogger{
    public FileLogger(int label) {
        this.label = label;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::logger: " + message);
    }
}
