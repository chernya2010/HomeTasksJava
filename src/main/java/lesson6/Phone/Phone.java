package main.java.lesson6.Phone;
//Создайте класс Phone, который содержит переменные number, model и
//weight.
public class Phone {
    private int number;
    private String model;
    private int weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }
    //Добавить конструктор в класс Phone, который принимает на вход три
    //параметра для инициализации переменных класса - number, model и
    //weight.
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    //Добавить конструктор, который принимает на вход два параметра для
    //инициализации переменных класса - number, model.
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    //Добавить конструктор без параметров.
    public Phone() {
    }
    //Добавить в класс Phone методы:
    //receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }
    //Добавить в класс Phone методы:
    // getNumber – возвращает номер телефона.
    public int getNumber(int number){
        return number;
    }
    //Добавьте перегруженный метод receiveCall, который принимает два
    //параметра - имя звонящего и номер телефона звонящего.
    public void receiveCall(String name, int number){
        System.out.println("Звонит: " + name);
        System.out.println("Номер телефона: " + number);
    }
    //Создать метод sendMessage с аргументами переменной длины
    public void sendMessage(String... values){

    }

    public static void main(String[] args) {
        //Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
        Phone phone1 = new Phone(555111, "Nokia", 100);
        Phone phone2 = new Phone(555222, "Motorola", 200);
        Phone phone3 = new Phone(555333, "Samsung", 300);
        System.out.println("Phone1 number is: " + phone1.getNumber() + "; " + "Phone1 model is: " + phone1.getModel() + "; " + "Phone1 weight is: " + phone1.getWeight());
        System.out.println("Phone2 number is: " + phone2.getNumber() + "; " + "Phone2 model is: " + phone2.getModel() + "; " + "Phone2 weight is: " + phone2.getWeight());
        System.out.println("Phone3 number is: " + phone3.getNumber() + "; " + "Phone3 model is: " + phone3.getModel() + "; " + "Phone3 weight is: " + phone3.getWeight());

        //Вызвать методы receiveCall и getNumber для каждого из объектов.
        phone1.receiveCall("Валера");
        phone1.getNumber(555111);
        phone2.receiveCall("Петя");
        phone2.getNumber(555222);
        phone3.receiveCall("Юра");
        phone3.getNumber(555333);
        //Вызвать перегруженный метод receiveCall
        phone1.receiveCall("Александр", 666555);
    }

}
