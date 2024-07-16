package class_lesson.lesson14.threads;

public class JThread extends Thread{
    JThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        int coutnter = 1;
        while (!isInterrupted()){
            System.out.println("Цикл " + coutnter++);
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        JThread jThread = new JThread("JThread");
        jThread.start();
        try {
            Thread.sleep(50);
            jThread.interrupt();
            Thread.sleep(50);
        } catch (InterruptedException ex){
            System.out.println();
        }
        System.out.println("Главный поток завершил работу");
    }
}
