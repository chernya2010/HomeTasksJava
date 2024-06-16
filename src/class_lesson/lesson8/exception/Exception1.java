package class_lesson.lesson8.exception;

public class Exception1 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 50 / d;
        } catch (ArithmeticException e){
            System.out.println("Ошибка! Деление на 0\n" + e);

        }
        System.out.println("Код после оператора catch");
        System.out.println("----------------------------------------------------");
        try{
            int b = args.length;
            System.out.println("b = " + b);
            int c = 10 / b;
            int[] m = {1};
            m[10] = 999;
        } catch (ArithmeticException e){
            System.out.println("Ошибка! Деление на 0\n" + e);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Ошибка! Индекс за пределами массива\n" + exception);
        }
        System.out.println("Код после оператора catch");
        System.out.println("----------------------------------");
        try{
            int a1 = 0;
            int b1 = 10 / a1;

        } catch(ArithmeticException ex){
            System.out.println("Перехват исключения общего класса");
        } catch (Exception exception){
            System.out.println("Общий класс исключений");
        }
    }
}
