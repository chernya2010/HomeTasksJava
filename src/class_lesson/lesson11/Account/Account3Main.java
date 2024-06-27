package class_lesson.lesson11.Account;

public class Account3Main {
    public static void main(String[] args) {
        Account3<String> account3 = new Account3<>("1234", 500);
        Account3<Integer> account4 = new Account3<>(567, 500);
        System.out.println(account3.getId());
        System.out.println(account4.getId());
    }
}
