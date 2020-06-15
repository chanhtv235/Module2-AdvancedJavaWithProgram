package part15_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");

    }
}
