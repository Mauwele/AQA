package Lesson_3;

public class Main {

    public static void main(String[] args) {

        // Запрос 1 пункта задания:
        Product nothingPhone2 = new Product("Nothing Phone 2", 11, 7, 2023, "Nothing Corp.", "United Kingdom", 653, false);
        nothingPhone2.showProductInfo();

        // Запрос 2 пункта задания:
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", 1, 2, 2025, "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro Max", 15, 3, 2025, "Apple Inc.", "China", 11999, false);
        productsArray[2] = new Product("Xiaomi 15 Ultra", 20, 4, 2025, "Xiaomi Corporation", "China", 899, true);
        productsArray[3] = new Product("Google Pixel 9 Pro", 10, 5, 2025, "Google LLC", "Vietnam", 999, false);
        productsArray[4] = new Product("OnePlus 12T", 1, 6, 2025, "OnePlus Technologies", "China", 799, true);

        productsArray[2].showProductInfo();

        //Запрос 3 пункта задания:
        Park bestPark = new Park();

        bestPark.addAttraction("Американские горки", "09:00-21:00", 300);
        bestPark.addAttraction("Колесо обозрения", "08:00-22:00", 100);
        bestPark.addAttraction("Карусель", "09:00-21:00", 150);

        System.out.println("\nИнформация об аттракционах:");
        bestPark.showAllAttractions();

        Object rollerCoaster = bestPark.findAttraction("Американские горки");
        Object ferrisWheel = bestPark.findAttraction("Колесо обозрения");
        Object carousel = bestPark.findAttraction("Карусель");

        // Проверка сеттеров и геттеров
        if (rollerCoaster != null) {
            ((Park.Attraction) rollerCoaster).setPrice(500);
            System.out.println("\nПроверка цены: " + ((Park.Attraction) rollerCoaster).getPrice());
        }

        if (ferrisWheel != null) {
            ((Park.Attraction) ferrisWheel).setNameOfAttraction("Большое колесо обозрения");
            System.out.println("\nПроверка названия: " + ((Park.Attraction) ferrisWheel).getNameOfAttraction());
        }

        if (carousel != null) {
            ((Park.Attraction) carousel).setWorkingTime("08:00-22:00");
            System.out.println("\nПроверка времени работы: " + ((Park.Attraction) carousel).getWorkingTime());
        }

        System.out.println("\nИнформация после изменений:");
        bestPark.showAllAttractions();
    }

}