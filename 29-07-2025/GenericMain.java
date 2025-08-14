package day8pgm;

public class GenericMain {
    public static void main(String[] args) {
        // Area of Rectangle
        UnBox<Integer> rectangleBox = new UnBox<>(10, 5, null, null, null);
        int rectangleArea = rectangleBox.getLength() * rectangleBox.getBreadth();
        System.out.println("Area of Rectangle is: " + rectangleArea);

        // Area of Circle
        UnBox<Double> circleBox = new UnBox<>(null, null, 7.0, null, null);
        double circleArea = Math.PI * circleBox.getRadius() * circleBox.getRadius();
        System.out.println("Area of Circle is: " + circleArea);

        // Perimeter of Square
        UnBox<Float> squareBox = new UnBox<>(null, null, null, null, 5.0f);
        float squarePerimeter = 4 * squareBox.getSide();
        System.out.println("Perimeter of Square is: " + squarePerimeter);

        // Area of Triangle
        UnBox<Double> triangleBox = new UnBox<>(6.0, null, null, 3.0, null);
        double triangleArea = 0.5 * triangleBox.getLength() * triangleBox.getHeight();
        System.out.println("Area of Triangle is: " + triangleArea);

        // Display Message using String class
        GenericMessage<String> message = new GenericMessage<>("Above are the complete examples of Generic class using String class.");
        System.out.println(message.getMessage());
    }
}
