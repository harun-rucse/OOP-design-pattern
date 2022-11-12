package chain_of_responsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int label;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int label, String message) {
        if(this.label >= label) {
            write(message);
        } else if(nextLogger != null) {
            nextLogger.logMessage(label, message);
        }
    }

    protected abstract void write(String message);
}
