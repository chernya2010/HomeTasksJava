package main.java.lesson15.lambda;


import java.util.function.Function;

public class Lambda3 {
    /*Создайте метод changeString() с 2 параметрами. 1 параметр - строка,
    2 параметр -лямбда выражение. Отдельно создайте несколько лямбда-выражений,
    пусть они каким-то образом изменяют строку или добавляют в неё что-то:)
    Затем вызовите в main созданный метод и продемонстрируйте его работу.*/

    Function<String, String> toUppercase = s -> s.toUpperCase();

    public static String changeString(String inputStr, Function<String, String> func) {
        return func.apply(inputStr);
    }

    public static void main(String[] args) {
    String s = "Hello world!";

    System.out.println(changeString(s, String::toUpperCase));
    }
}