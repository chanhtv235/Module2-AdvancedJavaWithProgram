package interfaceAndAbstract.colorable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Square square = new Square(30,"yellow",true);
        System.out.println(square.toString());
        square.howToColor();
    }
}