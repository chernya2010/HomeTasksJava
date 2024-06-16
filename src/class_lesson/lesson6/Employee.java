package class_lesson.lesson6;


public class Employee extends Person {

    public String company;

    public Employee(String name, String surename, String company) {
        super(name, surename);
        this.company = company;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Название компании "+this.company);
        System.out.println("Имя: "+super.getName());
        System.out.println("Фамилия: "+super.getSurename());

    }


}
