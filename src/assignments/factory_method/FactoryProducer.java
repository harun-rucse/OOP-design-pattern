package assignments.factory_method;

public class FactoryProducer {
    public static AbstractNotificationFactory getFactory(String factoryType) throws Exception {
        if(factoryType.equalsIgnoreCase("regular")) {
            return new RegularNotificationFactory();
        } else if(factoryType.equalsIgnoreCase("realtime")) {
            return new RealtimeNotificationFactory();
        } else {
            return null;
        }
    }
}
