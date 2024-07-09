package class_lesson.lesson14.threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        MyThread myThread = new MyThread("MyThread");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException ex){
            System.out.println();
        }
        System.out.println("Главный поток завершил работу");
    }
}
