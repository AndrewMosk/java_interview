package polymorphism;

public class Circle extends Shape implements ShapeOperations {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        if (area==0) {
            area = Math.PI * Math.pow(r, 2);
        }
        return area;
    }

    public double getR() {
        return r;
    }
}
