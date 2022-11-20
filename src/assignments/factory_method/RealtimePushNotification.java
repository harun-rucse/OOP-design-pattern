package assignments.factory_method;

public class RealtimePushNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending realtime push notification: "  + text);
    }
}
