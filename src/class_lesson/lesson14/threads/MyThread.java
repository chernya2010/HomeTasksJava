package class_lesson.lesson14.threads;

public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex){
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
//        System.out.println("Главный поток стартовал");
//        MyThread myThread = new MyThread("MyThread");
//        myThread.start();
//        System.out.println("Главный поток завершил работу");
        System.out.println("Главный поток стартовал");
        for (int i = 1; i < 6; i++){
            new MyThread("MyThread " + i).start();
        }
        System.out.println("Главный поток завершил работу");

    }
}
