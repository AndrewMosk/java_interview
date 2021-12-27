package polymorphism;

public class Triangle extends Shape implements ShapeOperations {

    private final double basis;

    private final double height;

    public Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        if (getArea()==0) {
            setArea(0.5 * basis * height);
        }
        return getArea();
    }

    public double getBasis() {
        return basis;
    }

    public double getHeight() {
        return height;
    }
}
