package main.java.lesson16;

import java.util.*;
import java.util.stream.Collectors;

public class StreamProject {
    public static void main(String[] args) {
        /*   - Создайте массив целых чисел и отсортируйте его*/
        int[] numbers = {5, 25, 55, 31, 77, 0, 2, 4, 7, 8, 9};
        int[] sortedStream = Arrays.stream(numbers).sorted().toArray();
        System.out.println("Отсортированный массив чисел: " + Arrays.toString(sortedStream));

        /*   - Создайте массив целых чисел и найдите максимальное значение*/
        int maxVal=Arrays.stream(numbers).max().getAsInt();
        System.out.println("Максимальное значение массива целых чисел: " + maxVal);

        /*   - Создайте массив целых чисел и найдите минимальное значение */
        int minVal=Arrays.stream(numbers).min().getAsInt();
        System.out.println("Минимальное значение массива целых чисел: " + minVal);

        /*   - Создайте массив целых чисел и найдите среднее значение */
        double avgVal=Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Среднее значение массива целых чисел: " + avgVal);

        /* - Создайте список строк и отфильтруйте их, оставив только те, которые начинаются с определенного символа.*/
        System.out.println("-------------------------------------------");
        List<String> list = Arrays.asList("Париж", "Лондон", "Москва");
        list.stream()
                .filter(e -> e.toLowerCase()
                        .startsWith("м"))
                .forEach(System.out::println);

        /*   - Создайте список объектов, содержащих информацию о книгах
        (название, автор, год издания), и сгруппируйте их по автору*/
        System.out.println("-------------------------------------------");
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("book1", "author1", 1990),
                new Book("book2", "author2", 1991),
                new Book("book3", "author3", 1992),
                new Book("book4", "author3", 1994)
        ));
        Map<String, Set<Book>> res = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.toSet()));
        res.forEach((key, value) -> System.out.println(key + ":" + value));

        /*   - Создайте список объектов, содержащих информацию о заказах
        (название продукта, количество), и посчитайте общее количество элементов */
        System.out.println("-------------------------------------------");
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product("product1", 1990),
                new Product("product2", 1991),
                new Product("product3", 1992)
        ));
        int size = products.size();
        System.out.println("Количество элементов в списке: " + size);



        /*   - Создайте список объектов, содержащих информацию о заказах
        (название продукта, количество, дата заказа), и найдите все продукты, заказанные в определенный день */
        System.out.println("-------------------------------------------");
        ArrayList<Product> products2 = new ArrayList<>(Arrays.asList(
                new Product("product1", 1990, "01-01-1990"),
                new Product("product2", 1991, "02-01-1991"),
                new Product("product3", 1992, "03-01-1992"),
                new Product("product4", 1990, "01-01-1990")
        ));
        List<Product> filteredList = products2.stream()
                .filter(empl -> empl.getOrderDate().equals("01-01-1990"))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);

        /*   - Создайте список объектов, содержащих информацию о продуктах
        (название, цена), и найдите самый дешевый продукт */
        System.out.println("-------------------------------------------");
        ArrayList<Product> products3 = new ArrayList<>(Arrays.asList(
                new Product("product1", 1990, "01-01-1990", 100),
                new Product("product2", 1991, "02-01-1991", 200),
                new Product("product3", 1992, "03-01-1992", 300),
                new Product("product4", 1990, "01-01-1990", 50)
        ));
        Product minPrice = products3
                .stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Продукт с минимальной ценой: " + minPrice);

        /*    - Создайте список целых чисел и удалите из него все отрицательные числа*/
        System.out.println("-------------------------------------------");
        List<Integer> listNums = new ArrayList<>();
        Collections.addAll(listNums, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        listNums.removeIf(n -> n < 0);
        System.out.println(listNums);
    }
}