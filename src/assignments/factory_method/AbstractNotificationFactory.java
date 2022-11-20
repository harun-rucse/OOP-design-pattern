package assignments.factory_method;

public abstract class AbstractNotificationFactory {
    abstract Notification createNotification(String channelType) throws Exception;
}
