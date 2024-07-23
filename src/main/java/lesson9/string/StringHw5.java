package main.java.lesson9.string;

public class StringHw5 {
    public static void main(String[] args) {

        String inputString = "Hello";

        String doubledString = doubleCharacters(inputString);

        System.out.println("Строка с удвоенными символами: " + doubledString);

    }

    public static String doubleCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }

        return result.toString();
    }
}
