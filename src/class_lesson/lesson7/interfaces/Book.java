package class_lesson.lesson7.interfaces;

public class Book  implements Printable, ExtendedPrintable{
    private String name;
    private String author;
    private int year;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга %s автор %s, была издана в %s году\n", name, author, year);
    }

    @Override
    public void extendedPrint() {
        System.out.println("Extended Print");
    }

    public Book(){
        
    }
}
