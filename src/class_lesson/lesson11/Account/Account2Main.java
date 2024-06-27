package class_lesson.lesson11.Account;

public class Account2Main {
    public static void main(String[] args) {
        Accountable<String> account = new Account2<>("1234", 500);
        Account2<String> account2 = new Account2<>("5678", 500);
        System.out.println(account.getId());
        System.out.println(account2.getId());
    }
}
