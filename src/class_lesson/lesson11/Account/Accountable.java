package class_lesson.lesson11.Account;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
