package class_lesson.lesson14.threads;

public class MyThread2 implements Runnable{
    private boolean isActive;

    public MyThread2() {
        isActive = true;
    }

    public void disable(){
        isActive = false;
    }

    @Override
    public void run(){
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        int coutnter = 1;
        while (isActive){
            System.out.println("Цикл " + coutnter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex){
                System.out.println("Поток прерван");
            }
        }System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2, "MyThread2").start();
        try {
            Thread.sleep(1100);
            myThread2.disable();
            Thread.sleep(1100);
        } catch (InterruptedException ex){
            System.out.println();
        }
        System.out.println("Главный поток завершил работу");
    }
}
