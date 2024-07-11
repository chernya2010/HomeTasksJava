package class_lesson.lesson16;

public class Telephone {
    private String name;
    private  int price;
    private String model;

    public Telephone(String name, int price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Telephone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int compare(Telephone phone1, Telephone phone2){
        if (phone1.getPrice() > phone2.getPrice()){
            return 1;
        } else {
            return -1;
        }
    }
}
