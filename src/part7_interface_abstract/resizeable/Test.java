package part7_interface_abstract.resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] hinh = new Shape[3];
        Circle circle = new Circle(5, "indigo", false);
        Rectangle rectangle =new Rectangle(10,20,"red",true);
        Square square = new Square(30,"yellow",true);
        circle.resize(Math.random());
        rectangle.resize(Math.random());
        square.resize(Math.random());
        hinh[0] = circle;
        hinh[1] = rectangle;
        hinh[2] = square;
        System.out.println(Arrays.toString(hinh));
    }
}
