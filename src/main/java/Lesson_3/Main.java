package Lesson_3;

public class Main {

    /* 1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.  /*
     */

    public static class Product {
        private String name;
        private String productionDate;
        private String manufacturer;
        private String сountryOfOrigin;
        private int price;
        private Boolean statusBooking;
        public Product( String name, String productionDate, String manufacturer, String сountryOfOrigin, int price, Boolean statusBooking) {
            this.name = name;
            this.productionDate = productionDate;
            this.manufacturer = manufacturer;
            this.сountryOfOrigin = сountryOfOrigin;
            this.price = price;
            this.statusBooking = statusBooking;
        }
        public static void ProductInfo(Product product) {
            System.out.println("\nНазвание: " + product.name
                    + "\nДата производства: " + product.productionDate
                    + "\nПроизводитель: " + product.manufacturer
                    + "\nСтрана происхождения: " + product.сountryOfOrigin
                    + "\nЦена: " + product.price + " $"
                    + "\nСостояние бронирования покупателем: " + product.statusBooking);
        }
    }

    // 3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.

    public static class Park {
        public static class Attraction {
            private String nameOfAttraction;
            private String workingTime;
            private int price;

            public Attraction (String nameOfAttraction, String workingTime, int price) {
                this.nameOfAttraction = nameOfAttraction;
                this.workingTime = workingTime;
                this.price = price;
            }

            public String getnameOfAttraction() {
                return nameOfAttraction;
            }

            public void setNameOfAttraction(String nameOfAttraction) {
                this.nameOfAttraction = nameOfAttraction;
            }

            public String getworkingTime(String workingTime) {
                return workingTime;
            }

            public void setworkingTime(String workingTime) {
                this.workingTime = workingTime;
            }

            public int getprice() {
                return price;
            }

            public void setprice(int price) {
                this.price = price;
            }

            public void showInfo() { System.out.println("\nАттракцион: " + nameOfAttraction
                    + "\nВремя работы: " + workingTime
                    + "\nСтоимость: " + price + " руб.");
            }
        }
    }

    public static void main(String[] args) {

        // Запрос 1 пункта задания:
        Product nothingPhone2 = new Product("Nothing Phone 2", "11.07.2023", "Nothing Corp.", "United Kingdom", 653, false);
        Product.ProductInfo (nothingPhone2);

        // Запрос 2 пункта задания:
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 16 Pro Max", "15.03.2025", "Apple Inc.", "China", 11999, false);

        productsArray[2] = new Product("Xiaomi 15 Ultra", "20.04.2025", "Xiaomi Corporation", "China", 899, true);

        productsArray[3] = new Product("Google Pixel 9 Pro", "10.05.2025", "Google LLC", "Vietnam", 999, false);

        productsArray[4] = new Product("OnePlus 12T", "01.06.2025", "OnePlus Technologies", "China", 799, true);

        Product.ProductInfo (productsArray[2]);

        //Запрос 3 пункта задания:
        Park BestPark = new Park();

        Park.Attraction rollerCoaster = new Park.Attraction("Американские горки", "09:00-21:00", 300);

        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "08:00-22:00", 100);

        Park.Attraction carousel = new Park.Attraction("Карусель", "09:00-21:00", 150);
        
        rollerCoaster.showInfo();
        ferrisWheel.showInfo();
        carousel.showInfo();

        // Проверка сеттеров
        rollerCoaster.setprice(500);
        ferrisWheel.setNameOfAttraction("Большое колесо обозрения");
        carousel.setworkingTime("08:00-22:00");

        rollerCoaster.showInfo();
        ferrisWheel.showInfo();
        carousel.showInfo();

    }
    
}
