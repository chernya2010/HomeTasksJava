package class_lesson.lesson6.bank;

public class Employee1 extends Person1 {

    public String bank;

    public Employee1(String name, String surname, String company) {
        super(name, surname);
        this.bank = company;
    }
    @Override
    public void displayInfo(){
        System.out.println("Название компании "+this.bank);
        System.out.println("Имя: "+super.getName());
        System.out.println("Фамилия: "+super.getSurname());

    }
    public Employee1(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }
}