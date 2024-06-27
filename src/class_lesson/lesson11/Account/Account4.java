package class_lesson.lesson11.Account;

public class Account4<T, S> {
    private T id;
    private S sum;

    public Account4(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }
}
