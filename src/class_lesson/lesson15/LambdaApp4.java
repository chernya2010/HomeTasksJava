package class_lesson.lesson15;

import class_lesson.lesson11.operation.Operation;

public class LambdaApp4 {

    public static void main(String[] args) {
        Operatinable function = action(1);
        int a = function.calculate(6, 5);
        System.out.println(a);

        int b = action(2).calculate(8, 2);
        System.out.println(b);
    }

    private static Operatinable action(int nubmer){
        switch (nubmer){
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }
}
