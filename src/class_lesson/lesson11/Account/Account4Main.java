package class_lesson.lesson11.Account;

public class Account4Main {
    public static void main(String[] args) {
        Account4<String, Double> account3 = new Account4<>("1234", 500.00);
        String id = account3.getId();
        Double sum = account3.getSum();
        System.out.printf("Это id: %s. А это sum: %.2f", id, sum);
    }
}
