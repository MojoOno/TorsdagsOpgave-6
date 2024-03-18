package Task4;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(4);

        Square square1 = new Square(5);
        Square square2 = new Square(10);

        ShapeBuilder builder = new ShapeBuilder();

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(square1.getArea());
        System.out.println(square2.getArea());
        System.out.println("\n"); //Printer en ny linje for at se pænt ud

        builder.addShape(circle1);
        builder.addShape(circle2);
        builder.addShape(square1);
        builder.addShape(square2);

        System.out.println("Total area er: " + builder.getTotalArea());


    }
}
