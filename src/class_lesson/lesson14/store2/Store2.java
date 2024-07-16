package class_lesson.lesson14.store2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store2 {
    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    public Store2() {
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }

    public void get(){
        try {
            locker.lock();
            while (product < 1){
                condition.await();
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Продуктов осталось на складе " + product);
            condition.signalAll();
        } catch (InterruptedException ex){
        } finally {
            locker.unlock();
        }
    }

    public void put(){
        try {
            locker.lock();
            while (product >= 3){
                condition.await();
            }
            product++;
            System.out.println("Производитель произвёл 1 товар");
            System.out.println("Продуктов осталось на складе " + product);
            condition.signalAll();
        } catch (InterruptedException ex){
        } finally {
            locker.unlock();
        }
    }
}
