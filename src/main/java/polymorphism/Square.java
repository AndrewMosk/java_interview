package polymorphism;

public class Square extends Shape implements ShapeOperations {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        if (area==0) {
            area = Math.pow(side, 2);
        }
        return area;
    }

    public double getSide() {
        return side;
    }
}
