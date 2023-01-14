public class Cylinder extends Circle {

    // Instance Field.
    private double height;

    // Parameterized Constructor.
    public Cylinder(double radius, double height) {
        super(radius);

        // Checks for invalid input.
        this.height = (height < 0) ? 0 : height;
    }

    // Getter method.
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
