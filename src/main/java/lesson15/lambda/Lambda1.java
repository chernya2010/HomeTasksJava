package main.java.lesson15.lambda;

import java.util.function.Function;

public class Lambda1 {
    public static void main(String[] args) {
        /*Создайте переменную встроенного типа Function<String, Integer>
        и запишите в неё лямбда-выражение, принимающее строку и возвращающее кол-во символов в ней.*/
        String s = "Hello world!!";
        Function<String, Integer> stringLength = x -> Integer.valueOf(s.length());
        System.out.println(stringLength.apply(s));
    }
}