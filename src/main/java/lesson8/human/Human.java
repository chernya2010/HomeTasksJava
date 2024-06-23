package main.java.lesson8.human;

public class Human implements Jacket, Trousers, Footwear {
    private String name;
    private String jacket;
    private String trousers;
    private String footwear;

    public Human(String name, String jacket, String trousers, String footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    @Override
    public void putOn() {
        System.out.println(name);
        Jacket.super.putOn();
        Trousers.super.putOn();
        Footwear.super.putOn();
    }

    @Override
    public void takeOff() {
        System.out.println(name);
        Jacket.super.takeOff();
        Trousers.super.takeOff();
        Footwear.super.takeOff();
    }
}
