package assignments.factory_method;

public class RealtimeEmailNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending realtime email: "  + text);
    }
}
