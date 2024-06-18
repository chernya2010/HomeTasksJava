package class_lesson.lesson9.Strings;

public class Substring {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String replaceStr1 = str1.replace('l', 'k');
        String replaceStr2 = str1.replace("Hello", "Bye");
        System.out.println(replaceStr1);
        System.out.println(replaceStr2);

        String str2 = " Hello World ";
        System.out.println(str2.trim());

        String str3 = "Hello World";
        String substring1 = str3.substring(6);//начать вырезать с определённого места
        String substring2 = str3.substring(3, 5);//вырезать кусок из центра строки
        System.out.println(substring1);
        System.out.println(substring2);

    }
}
