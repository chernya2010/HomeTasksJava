package main.java.lesson15.lambda;

import java.util.Arrays;

public class Lambda2 {
    public static void main(String[] args) {
        /*Создайте массив целых чисел, например, из 10 элементов.
        Используя лямбда-выражение, отсортируйте массив по убыванию.
        Выведите массив, используя цикл foreach.*/
        Integer [] arrInt = {10,25,47,1,8,69,33,18,22,66};
        Arrays.sort(arrInt, (i1, i2) -> Integer.compare(i2, i1));
        for (int i : arrInt) System.out.println(i);
    }
}