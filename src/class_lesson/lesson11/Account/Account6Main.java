package class_lesson.lesson11.Account;

public class Account6Main {
    public static void main(String[] args) {
        DepositAccount6 depositAccount6 = new DepositAccount6<>(123);
        System.out.println(depositAccount6.getId());

        DepositAccount6 depositAccount7 = new DepositAccount6<>("456");
        System.out.println(depositAccount7.getId());

        Account6<Integer> depositAccount8 = new DepositAccount6<>(789);
        System.out.println(depositAccount8.getId());
    }
}
