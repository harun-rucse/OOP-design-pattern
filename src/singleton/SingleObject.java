package singleton;

public class SingleObject {
    private static SingleObject instance;

    private SingleObject() {}

    public static SingleObject getInstance() {
        if(SingleObject.instance == null) {
            SingleObject.instance = new SingleObject();
        }

        return SingleObject.instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
