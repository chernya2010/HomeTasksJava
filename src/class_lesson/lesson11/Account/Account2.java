package class_lesson.lesson11.Account;

public class Account2<T> implements Accountable<String>{
    private String id;
    private int sum;

    public Account2(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public int getSum() {
        return sum;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }


}
