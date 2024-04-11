package main.java;
import java.io.Console;

public class NewClass {
    public static void main(String[] args) {
        String name;
        Console con = System.console();
        name = con.readLine("Please, enter your name: ");
        System.out.println("Welcome to Java, " + name); //добавил коммментарий
    }
}