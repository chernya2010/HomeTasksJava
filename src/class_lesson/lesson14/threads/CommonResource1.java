package class_lesson.lesson14.threads;

public class CommonResource1 {
    int x = 1;
    synchronized void increment(){
        x = 1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s result.x = %d\n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
