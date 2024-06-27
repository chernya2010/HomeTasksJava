package class_lesson.lesson11.Account;

public class DepositAccount7<T, S> extends Account6<T>{
    private S sum;

    public DepositAccount7(T id) {
        super(id);
    }

    public S getSum() {
        return sum;
    }

    public DepositAccount7(T id, S sum) {
        super(id);
        this.sum = sum;
    }

    public static void main(String[] args) {
        DepositAccount7<Integer, String> depositAccount7 = new DepositAccount7<>(20, "30");
        System.out.println(depositAccount7.getId() + " " + depositAccount7.getSum());
        System.out.println("-----");
        DepositAccount7<String, Integer> depositAccount8 = new DepositAccount7<>("20", 30);
        System.out.println(depositAccount8.getId() + " " + depositAccount8.getSum());
    }
}
