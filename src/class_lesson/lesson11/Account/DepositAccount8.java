package class_lesson.lesson11.Account;

public class DepositAccount8 extends Account6<Integer>{

    public DepositAccount8(int id) {
        super(id);
    }

    public static void main(String[] args) {
        DepositAccount8 depositAccount8 = new DepositAccount8(2);
        System.out.println(depositAccount8.getId());
    }
}
