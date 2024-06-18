package class_lesson.lesson7.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        Season season1 = Season.WINTER;
        System.out.println(Season.class.getSuperclass());
        System.out.println(season.name());
        System.out.println(season.toString());
        System.out.println(season.ordinal());
        System.out.println(Arrays.toString(Season.values()));

        Direction direction = Direction.UP;
        System.out.println(direction.opposite());

        DayOfWeekEnum dayOfWeekEnum = DayOfWeekEnum.SATURDAY;
        int number = DayOfWeekEnum.MONDAY.getNumberByName("Понедельник");
        System.out.println(number);

        Type type = Type.INTEGER;
        System.out.println(type.parse("1"));
    }
}
