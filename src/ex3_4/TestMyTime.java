package ex3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t = new MyTime(23, 59, 59);
        System.out.println(t);          // 23:59:59
        t.nextSecond();
        System.out.println(t);          // 00:00:00
        t.previousMinute();
        System.out.println(t);          // 23:59:00
    }
}
