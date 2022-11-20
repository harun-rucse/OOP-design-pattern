package assignments.factory_method;

public class RealtimeSMSNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending realtime sms: "  + text);
    }
}
