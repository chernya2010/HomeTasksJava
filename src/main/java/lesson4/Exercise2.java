package main.java.lesson4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль(в виде матрицы).
Вывести нечетные элементы находящиеся под главной диагональю(включительно).*/
public class Exercise2 {
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
        //Задание 2
        for (int i = 0; i < array.length; i++) {//Проходим по строкам
            for (int j = 0; j < array.length; j++) {//Проходим по колонкам
                if (i - 1 == j && array[i][j] % 2 != 0) {//Если индекс колонки равен индексу строки - 1 и значение индекса не чётное,
                    System.out.print(array[i][j] + " ");//выводим значение
                }
            }
        }
    }
}