package ex5_2;

public class TestCylinder {
    public static void main(String[] args) {
        // Tạo hình trụ mặc định
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: " + c1);
        System.out.println("Base circle: " + c1.getBase());
        System.out.println("Height: " + c1.getHeight());
        System.out.printf("Base area: %.2f%n", c1.getBase().getArea());
        System.out.printf("Volume: %.2f%n", c1.getVolume());
        System.out.printf("Surface area: %.2f%n", c1.getSurfaceArea());

        System.out.println();

        // Tạo hình trụ với tham số
        Cylinder c2 = new Cylinder(2.5, "blue", 5.0);
        System.out.println("Cylinder 2: " + c2);
        System.out.println("Base circle: " + c2.getBase());
        System.out.println("Height: " + c2.getHeight());
        System.out.printf("Base area: %.2f%n", c2.getBase().getArea());
        System.out.printf("Volume: %.2f%n", c2.getVolume());
        System.out.printf("Surface area: %.2f%n", c2.getSurfaceArea());
    }
}
