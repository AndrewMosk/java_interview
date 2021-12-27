package polymorphism;

import java.util.ArrayList;

public class TestPolymorphism {
    public static void main(String[] args) {
        ArrayList<ShapeOperations> operations = new ArrayList<>();

        operations.add(new Circle(5));
        operations.add(new Square(5));
        operations.add(new Triangle(5, 6));

        operations.forEach(o -> System.out.println(o.calculateArea()));
    }
}
