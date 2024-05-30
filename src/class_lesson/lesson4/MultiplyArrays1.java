package class_lesson.lesson4;
import java.util.*;

public class MultiplyArrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println("Введите элемент [" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }
}