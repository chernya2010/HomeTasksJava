package class_lesson.lesson6.bank;

public class Client1 extends Person1{
    private String bank;

    public Client1(String name, String surname, String bank){
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void displayInfo() {
        System.out.println("Название компании "+this.bank);
        System.out.println("Имя: "+super.getName());
        System.out.println("Фамилия: "+super.getSurname());
    }

    public String getBank() {
        return bank;
    }
}
