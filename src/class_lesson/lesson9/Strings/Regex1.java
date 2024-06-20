package class_lesson.lesson9.Strings;

import class_lesson.lesson4.MultiplyArrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String regex = "java";
        String regex1 = "\\d{3}";//3 цифровых символа

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        //жадный режим (самое длинное совпадение)
        String text = "Егор Алла Александр";
        Pattern pattern1 = Pattern.compile("А.+а");
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
        String text1 = "Алла";
        boolean isMutch = Pattern.matches("А.+а",text1);
        System.out.println(isMutch);

        boolean isMutch2 = Pattern.matches(".*А.+а.*",text);
        System.out.println(isMutch2);

        String text2 = "ааабв";
        Pattern pattern2 = Pattern.compile("а++");
        Matcher matcher1 = pattern2.matcher(text2);
        while (matcher1.find()){
            System.out.println(text2.substring(matcher1.start(), matcher1.end()));
        }

        String text3 = "Егор Алла Александр";
        Pattern pattern3 = Pattern.compile("А.+?а");
        Matcher matcher3 = pattern3.matcher(text3);
        while (matcher3.find()){
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }
        //сверхжадный режим
        //ленивый режим (самое короткое совпадение)

        Pattern pattern4 = Pattern.compile(".*");
        System.out.println(pattern4);

        System.out.println(Pattern.matches("А.+а", "Анна"));

        Pattern pattern5 = Pattern.compile(".*", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern5.flags());

        String s = "Егор Анна Алла";
        Pattern p = Pattern.compile("\\s");
        String[] strings = p.split(s, 2);
        for(String str : strings){
            System.out.println(str);
        }


    }
}
