package ex4_2;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Quoc", "Hoian");
        System.out.println(p1);

        Student s1 = new Student("trung", "Danang", "Computer Science", 2025, 1500.5);
        System.out.println(s1);

        Staff st1 = new Staff("truong", "HCM City", "VKU", 3000.0);
        System.out.println(st1);
    }
}
