package assignments.factory_method;

public class NotificationService {
    public static void main(String[] args) {
        try {
            AbstractNotificationFactory realtimeFactory = FactoryProducer.getFactory("realtime");
            Notification notification = realtimeFactory.createNotification("push");
            notification.notifyUser("Hello world");

            AbstractNotificationFactory regularFactory = FactoryProducer.getFactory("regular");
            Notification notification2 = regularFactory.createNotification("sms");
            notification2.notifyUser("Hello world");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
