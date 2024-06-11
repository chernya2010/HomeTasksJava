package class_lesson.lesson7.interfaces;

public class Programm {
    public static void main(String[] args) {
        Calculatable calculatable = new Calculation();
        System.out.println(calculatable.sum(1, 2));
        System.out.println(calculatable.sum(1, 2, 3));

        WaterPipe waterPipe = new WaterPipe();
        waterPipe.printState(1);

        read(new Book("Java","Author"));
        read(new Journal("Java"));

        Printable printable = createPrintable("Hello create printable", true);
        printable.print();
    }

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option){
            return new Book(name, "Имя автора");
        } else {
            return new Journal(name);
        }
    }
}
