package class_lesson.lesson7.enums;

public class DayOfWeek {

    private String title;

    public DayOfWeek(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "DayOfWeek{title = "+ title+"}";
    }

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
        System.out.println(dayOfWeek);
    }
}
