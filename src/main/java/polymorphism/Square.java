package polymorphism;

public class Square extends Shape implements ShapeOperations {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        if (getArea()==0) {
            setArea(Math.pow(side, 2));
        }
        return getArea();
    }

    public double getSide() {
        return side;
    }
}
