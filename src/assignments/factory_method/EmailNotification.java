package assignments.factory_method;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending regular email: "  + text);
    }
}
