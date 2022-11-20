package assignments.factory_method;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending regular push notification: "  + text);
    }
}
