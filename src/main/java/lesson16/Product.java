package main.java.lesson16;

public class Product {
    String name;
    int count;
    String orderDate;
    int price;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Product(String name, int count, String orderDate) {
        this.name = name;
        this.count = count;
        this.orderDate = orderDate;
    }

    public Product(String name, int count, String orderDate, int price) {
        this.name = name;
        this.count = count;
        this.orderDate = orderDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", orderDate='" + orderDate + '\'' +
                ", price=" + price +
                '}';
    }
}