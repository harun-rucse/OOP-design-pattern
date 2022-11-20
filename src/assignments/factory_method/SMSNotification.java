package assignments.factory_method;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending regular sms: "  + text);
    }
}
