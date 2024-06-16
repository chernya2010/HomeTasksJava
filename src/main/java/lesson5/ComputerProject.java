package main.java.lesson5;

public class ComputerProject {
    public static void main(String[] args) {
        Computer computer = new Computer();

        if(computer.computerON()){
            computer.description("Intel i5", "8gb", "512gb", 3);
            computer.computerOFF();
        }
    }
}
