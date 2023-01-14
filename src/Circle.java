public class Circle {

    // Instance Field.
    private double radius;

    // Parameterized Constructor.
    public Circle(double radius) {
        // Checks for invalid input.
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Getter method.
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
