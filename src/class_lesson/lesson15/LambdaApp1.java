package class_lesson.lesson15;

public class LambdaApp1 {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operatinable1 operatinable1 = () -> {
          x = 30;
          return x + y;
        };
        System.out.println(operatinable1.calculate());
        System.out.println(x);
    }
}
