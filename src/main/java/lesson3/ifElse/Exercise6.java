package main.java.lesson3.ifElse;
/*Даны 2 числа. Вывести большее из них.*/
public class Exercise6 {
    public static void main(String[] args) {
        int a = -4;
        int b = 0;

        if (a > b) {
            System.out.println(a); 
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
