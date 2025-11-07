package ex6_1;

public class TestMain {
    public static void main(String[] args) {
        Shape s1 = new Circle(2.5, "red", false);
        Shape s2 = new Rectangle(2.0, 3.0, "blue", true);
        Shape s3 = new Square(4.0, "yellow", true);

        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        System.out.println("\n" + s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        System.out.println("\n" + s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
    }
}
