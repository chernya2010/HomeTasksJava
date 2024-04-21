package main.java.lesson3.ifElse;
/*Дано целое число. 
Если оно является положительным, то прибавить к нему 1. 
Если отрицательным, то вычесть из него 2. 
Если нулевым, то заменить его на 10. 
Вывести полученное число.*/
public class Exercise3 {
    public static void main(String[] args) {
        int a = -1;

        if (a > 0) {
            a += 1;
        } else if (a < 0) {
            a = a -2;
        } else if (a == 0) {
            a = 10;
        }
        System.out.println(a);
    }
}
