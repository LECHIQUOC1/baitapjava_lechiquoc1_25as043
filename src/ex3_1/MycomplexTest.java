package ex3_1;

public class MycomplexTest {
        public static void main(String[] args) {
            // Tạo hai số phức
            MyComplex c1 = new MyComplex(3.0, 4.0);   // (3 + 4i)
            MyComplex c2 = new MyComplex(1.0, -2.0);  // (1 - 2i)

            System.out.println("Số phức c1 = " + c1);
            System.out.println("Số phức c2 = " + c2);
            System.out.println();

            // Kiểm tra các thuộc tính
            System.out.println("c1 có phải là số thực không? " + c1.isReal());
            System.out.println("c2 có phải là số ảo không? " + c2.isImaginary());
            System.out.println();

            // Tính độ lớn và góc
            System.out.printf("Độ lớn của c1 = %.2f%n", c1.magnitude());
            System.out.printf("Góc của c1 (radians) = %.2f%n", c1.argument());
            System.out.println();

            // So sánh
            System.out.println("c1 có bằng c2 không? " + c1.equals(c2));
            System.out.println("c1 có bằng (3,4) không? " + c1.equals(3.0, 4.0));
            System.out.println();

            // Thực hiện phép cộng, trừ, nhân, chia
            System.out.println("Cộng c1 và c2 (tạo mới): " + c1.addNew(c2));  // (3+4i)+(1-2i)
            System.out.println("Trừ c1 và c2 (tạo mới): " + c1.subtractNew(c2));
            System.out.println("Nhân c1 và c2: " + c1.multiply(c2));          // thay đổi c1
            System.out.println("Chia c1 cho c2: " + c1.divide(c2));           // thay đổi c1
            System.out.println();

            // Liên hợp
            System.out.println("Liên hợp của c2: " + c2.conjugate());
        }

}
