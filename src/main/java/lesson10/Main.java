package main.java.lesson10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product1 = new Product(1, "Товар 1", 10);
        Product product2 = new Product(2, "Товар 2", 5);
        Product product3 = new Product(3, "Товар 3", 2);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        List<Product> allProducts = shop.getAllProducts();
        System.out.println("Список товаров в магазине:");
        for (Product product : allProducts) {
            System.out.println("ID: " + product.getId() + ", Название: " + product.getName() + ", Цена: " + product.getPrice());
        }

        shop.sortByPrice();

        System.out.println("Список товаров, отсортированный по цене:");
        for (Product product : allProducts) {
            System.out.println("ID: " + product.getId() + ", Название: " + product.getName() + ", Цена: " + product.getPrice());
        }

        shop.deleteProduct(2);

        allProducts = shop.getAllProducts();
        System.out.println("Список товаров после удаления:");
        for (Product product : allProducts) {
            System.out.println("ID: " + product.getId() + ", Название: " + product.getName() + ", Цена: " + product.getPrice());
        }

        shop.sortByAdditionOrder();

        System.out.println("Список товаров, отсортированный по порядку добавления:");
        for (Product product : allProducts) {
            System.out.println("ID: " + product.getId() + ", Название: " + product.getName() + ", Цена: " + product.getPrice());
        }

        Product editedProduct = new Product(1, "Измененный товар", 15);
        shop.editProduct(editedProduct);

        allProducts = shop.getAllProducts();
        System.out.println("Список товаров после редактирования:");
        for (Product product : allProducts) {
            System.out.println("ID: " + product.getId() + ", Название: " + product.getName() + ", Цена: " + product.getPrice());
        }
    }
}
