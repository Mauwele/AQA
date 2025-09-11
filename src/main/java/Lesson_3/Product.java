package Lesson_3;

import java.util.Date;

/*
  1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
  2. Создать массив из 5 товаров.
 */

public class Product {
    private String name;
    private Date productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean statusBooking;

    public Product(String name, int day, int month, int year, String manufacturer, String countryOfOrigin, double price, boolean statusBooking) {
        this.name = name;
        this.productionDate = new Date(year - 1900, month - 1, day);
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.statusBooking = statusBooking;
    }

    public void showProductInfo() {
        System.out.println("\nНазвание: " + name
                + "\nДата производства: " + productionDate
                + "\nПроизводитель: " + manufacturer
                + "\nСтрана происхождения: " + countryOfOrigin
                + "\nЦена: " + price + " $"
                + "\nСостояние бронирования покупателем: " + statusBooking);
    }
}
