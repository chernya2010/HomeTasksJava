package main.java.lesson3.ifElse;
/*В переменную записываем число. 
Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное. 
Например, "это однозначное положительное число". 
Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более.*/
public class Exercise1 {
    public static void main(String[] args) {
        var a = -100;

        if (a >= 0 & a < 10) {
            System.out.println("Это однозначное положительное число");
        } else if (a >= 0 & a >= 10 & a < 100) {
            System.out.println("Это двузначное положительное число");
        } else if (a > -10 & a < 0) {
            System.out.println("Это однозначное отрицательное число");
        } else if (a <= -10 & a < 0 & a > -100) {
            System.out.println("Это двухначное отрицательное число");
        } else {
            System.out.println("Число трёхзначиное и более");
        };
    }
}