package main.java.lesson9.string;

public class StringHw3 {
    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        String[] words = str.split(" ");

        String minUniqueCharsWord = findMinUniqueCharsWord(words);

        System.out.println("Word with minimum unique characters: " + minUniqueCharsWord);
    }

    public static String findMinUniqueCharsWord(String[] words) {
        String minUniqueCharsWord = "";
        int minUniqueChars = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueChars = countUniqueChars(word);
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueCharsWord = word;
            }
        }

        return minUniqueCharsWord;
    }

    public static int countUniqueChars(String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (sb.indexOf(Character.toString(c)) == -1) {
                sb.append(c);
                count++;
            }
        }

        return count;
    }
}
