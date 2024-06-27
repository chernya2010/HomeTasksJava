package class_lesson.lesson11.Account;

public class DepositAccount9<T> extends Account7{
    private T sum;

    public DepositAccount9(int id, T sum) {
        super(id);
        this.sum = sum;
    }

    public T getSum() {
        return sum;
    }

    public static void main(String[] args) {
        DepositAccount9<Integer> depositAccount9 = new DepositAccount9<>(65, 444);
        System.out.println(depositAccount9.getId() + " " + depositAccount9.getSum());
    }
}
