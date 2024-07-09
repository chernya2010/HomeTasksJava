package class_lesson.lesson15.interfaces;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов", x);
        printer.accept(56);
    }
}
