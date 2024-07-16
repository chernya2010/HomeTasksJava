package class_lesson.lesson14.philosopher;
import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    Semaphore semaphore;
    int eatingNum = 0;
    int id;

    public Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (eatingNum < 3){
                semaphore.acquire();
                System.out.println("Философ " + id + " садится за стол");
                Thread.sleep(500);
                eatingNum++;
                System.out.println("Философ " + id + " выходит из-за стол");
                semaphore.release();
                Thread.sleep(500);
            }
        } catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore1 = new Semaphore(2);
        for (int i = 1; i < 6; i++){
            new Philosopher(semaphore1, i).start();
        }
    }
}
