package class_lesson.lesson11.Account;

public class Account5Main {
    public static void main(String[] args) {
        Account5 account5 = new Account5(555, 666);
        Account5 account6 = new Account5("SuperduperId", 666);
        System.out.println(account5.getId());
        System.out.println(account6.getId());
    }
}
