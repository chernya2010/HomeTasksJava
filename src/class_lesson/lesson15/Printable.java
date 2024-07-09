package class_lesson.lesson15;

public interface Printable {
    void print(String s);

    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);
        printable.print("sasdf");
        printable.print("sasdsdfsdff");
        printable.print("sasdsdfsdfывфаывафываf");
    }
}
