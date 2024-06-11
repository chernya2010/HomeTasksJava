package main.java.lesson4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль(в виде матрицы).
Транспонировать матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
- т.е. это операция, при которой строки и столбцы меняются местами.*/
public class Exercise5 {
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
        System.out.println();
        //Задание 5
        int[][] transpose = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        for (int[] element : transpose) {
            System.out.println(Arrays.toString(element));
        }
    }
}