package polymorphism;

public class Circle extends Shape implements ShapeOperations {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        if (getArea()==0) {
            setArea(Math.PI * Math.pow(r, 2));
        }
        return getArea();
    }

    public double getR() {
        return r;
    }
}
