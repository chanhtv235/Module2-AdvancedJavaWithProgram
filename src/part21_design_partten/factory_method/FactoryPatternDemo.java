package part21_design_partten.factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory =new ShapeFactory(new Circle());
        factory.getShape().draw();
    }
}
