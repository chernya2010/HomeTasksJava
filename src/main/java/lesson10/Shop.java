package main.java.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Ошибка: товар с таким ID уже существует.");
                return;
            }
        }
        products.add(product);
    }

    public void editProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return;
            }
        }
        System.out.println("Ошибка: товар с таким ID не найден.");
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return;
            }
        }
        System.out.println("Ошибка: товар с таким ID не найден.");
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void sortByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.getPrice(), p2.getPrice());
            }
        });
    }

    public void sortByAdditionOrder() {
        Collections.reverse(products);
    }
}