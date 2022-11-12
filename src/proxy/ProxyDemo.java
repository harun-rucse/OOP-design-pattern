package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("design_pattern.jpeg");

        // Load from disk
        image.display();
        System.out.println("");

        // does not load form disk
        image.display();
    }
}
