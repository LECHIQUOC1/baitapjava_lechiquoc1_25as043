package ex2_2;

public class TestMain2_2 {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        authors[2] = new Author("Quoc le", "quocle762007@gmail.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Book[name=...,authors={...},price=...,qty=...]
        System.out.println("Authors: " + javaDummy.getAuthorNames());
    }
}
