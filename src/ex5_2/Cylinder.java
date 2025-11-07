package ex5_2;

public class Cylinder extends Circle {
    private Circle base;   // thành phần base
    private double height; // chiều cao

    // Constructor mặc định
    public Cylinder() {
        base = new Circle();  // tạo Circle mặc định
        height = 1.0;
    }

    // Constructor đầy đủ
    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Diện tích toàn phần
    public double getSurfaceArea() {
        return 2 * Math.PI * base.getRadius() * (base.getRadius() + height);
    }

    // Thể tích
    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}