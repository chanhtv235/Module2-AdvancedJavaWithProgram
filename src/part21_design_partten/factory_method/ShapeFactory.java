package part21_design_partten.factory_method;

public class ShapeFactory {
    private Shape shape;

    public ShapeFactory() {
    }
    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public Shape getShape(){
        return shape;
    }
}
