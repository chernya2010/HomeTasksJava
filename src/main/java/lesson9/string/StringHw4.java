package main.java.lesson9.string;

import java.util.Scanner;

public class StringHw4 {
    public static void main(String[] args) {
        String inputString = "Анна хотела помочь Алла";
        Scanner scanner = new Scanner(System.in);

        // Ввод номера слова
        System.out.println("Введите номер слова для проверки:");
        int wordIndex = scanner.nextInt();

        // Разбиваем строку на слова
        String[] words = inputString.split(" ");

        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: Недопустимый номер слова");
        } else {
            String selectedWord = words[wordIndex - 1];
            if (isPalindrome(selectedWord)) {
                System.out.println("Слово '" + selectedWord + "' является палиндромом");
            } else {
                System.out.println("Слово '" + selectedWord + "' не является палиндромом");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
