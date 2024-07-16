package class_lesson.lesson14.semaphore;

import java.util.concurrent.Semaphore;

public class CountThread4 implements Runnable{
    CommonResource4 result;
    Semaphore semaphore;
    String name;

    public CountThread4(CommonResource4 result, Semaphore semaphore, String name) {
        this.result = result;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешения");
            semaphore.acquire();
            result.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " : " + result.x);
                result.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
    }

    public static void main(String[] args) {
        Semaphore semaphore1 = new Semaphore(1);
        CommonResource4 commonResource4 = new CommonResource4();
        new Thread(new CountThread4(commonResource4, semaphore1, "Thread1")).start();
        new Thread(new CountThread4(commonResource4, semaphore1, "Thread2")).start();
        new Thread(new CountThread4(commonResource4, semaphore1, "Thread3")).start();
    }
}
