import ex1_5.account;

public static void main(String[] args) {
    account acc1 = new account("A001", "Alice", 500);
    account acc2 = new account("A002", "Bob", 300);

    System.out.println(acc1);
    System.out.println(acc2);

    acc1.credit(200);
    System.out.println("After credit Alice: " + acc1);

    acc1.debit(100);
    System.out.println("After debit Alice: " + acc1);

    acc1.transferTo(acc2, 300);
    System.out.println("After transfer: " + acc1);
    System.out.println("After transfer: " + acc2);
}
