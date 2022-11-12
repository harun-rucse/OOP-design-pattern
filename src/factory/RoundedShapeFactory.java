package factory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("SQUARE")) return new RoundedSquare();
        else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new RoundedRectangle();

        return null;
    }
}
