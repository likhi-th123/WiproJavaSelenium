package day8pgm;

public class UnBox<T extends Number> {
    private T length;
    private T breadth;
    private T radius;
    private T height;
    private T side;

    // Constructor
    public UnBox(T length, T breadth, T radius, T height, T side) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
        this.height = height;
        this.side = side;
    }

    // Getters
    public T getLength() {
        return length;
    }

    public T getBreadth() {
        return breadth;
    }

    public T getRadius() {
        return radius;
    }

    public T getHeight() {
        return height;
    }

    public T getSide() {
        return side;
    }
}

// Message class (not public, allowed to be here)
class GenericMessage<T> {
    private T message;

    public GenericMessage(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}
