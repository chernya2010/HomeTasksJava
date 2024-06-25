package class_lesson.lesson11;

import java.util.Arrays;
import java.util.List;

public class UtilMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        for(Object object : list){
            String data = Util.getValue(object, String.class);
            System.out.println(data);
            System.out.println(Util.<Integer>getValue(object));
        }
    }
}
