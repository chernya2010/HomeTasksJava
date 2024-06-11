package class_lesson.lesson7.interfaces;

public interface Printable {

    void print();

    default void prin1(){
        System.out.println("Undefined printable");
    }

    static void read(){
        System.out.println("Read printable");
    }

}
