package class_lesson.lesson4;

public class Book {
    //поля класса Book
    public String name;
    public String author;
    public int year;
    //конструктор без параметров
    Book(){
        name = "Неизвестная книга";
        author = "Неизвестный автор";
        year = 0;
    }
    //конструктор с параметрами
    Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    //инициализатор
    {
        name = "Неизвестная книга";
        author = "Неизвестный автор";
        year = 0;
    }

    public void info(){
        System.out.println("Имя этой книги: " + name);
    }


}
