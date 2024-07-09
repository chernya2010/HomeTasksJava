package class_lesson.lesson14.threads;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread3 implements Runnable{
    CommonResource3 result;
    ReentrantLock locker;

    public CountThread3(CommonResource3 result, ReentrantLock locker) {
        this.result = result;
        this.locker = locker;
    }

    @Override
    public void run() {
        try {
            locker.lock();
            result.x = 1;
            for(int i = 1; i < 5; i++){
                System.out.printf("%s result.x = %d\n", Thread.currentThread().getName(), result.x);
                result.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException ex){
        } finally {
            locker.unlock();
        }
    }

    public static void main(String[] args) {
        CommonResource3 commonResource3 = new CommonResource3();
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i =1; i < 6; i++){
            Thread thread = new Thread(new CountThread3(commonResource3, reentrantLock));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
