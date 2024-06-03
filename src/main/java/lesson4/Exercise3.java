package main.java.lesson4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль(в виде матрицы).
Проверить произведение элементов какой диагонали больше.*/
public class Exercise3 {
    public static void main(String[] args) {
        //Генерируем матрицу
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        scanner.close();
        //Задание 3
        int prodMainDiag = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    prodMainDiag *= array[i][j];
                }
            }
        }
        System.out.println("Произведение элементов главной диагонали: " + prodMainDiag);
        int prodSecDiag = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) == (array.length - 1)) {
                    prodSecDiag *= array[i][j];
                }
            }
        }
        System.out.println("Произведение элементов побочной диагонали: " + prodSecDiag);
        if (prodMainDiag > prodSecDiag){
            System.out.println("Произведение элементов главной диагонали больше");
        } else {
            System.out.println("Произведение элементов побочной диагонали больше");
        }
    }
}