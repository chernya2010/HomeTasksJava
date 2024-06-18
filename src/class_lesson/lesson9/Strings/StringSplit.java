package class_lesson.lesson9.Strings;

public class StringSplit {
    public static void main(String[] args) {
        String str1 = "This is test string";
        String[] parts = str1.split(" ");
        for (String s : parts){
            System.out.println(s);
        }
    }
}
