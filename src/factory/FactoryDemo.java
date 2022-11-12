package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape2 = roundedShapeFactory.getShape("square");
        shape2.draw();
    }
}
