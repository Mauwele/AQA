package Lesson_4;

import static Lesson_4.Animal.allCount;

public class Main {

    public static void main(String[] args) {

        // 1 задание:
        Animal hamsterPuh = new Animal("Пух", 10, 1);
        hamsterPuh.run(5);
        hamsterPuh.swim(1);

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(200);
        dogBobik.swim(6);

        Cat catBarsik = new Cat("Барсик", 15);
        catBarsik.run(50);
        catBarsik.swim(5);

        Bowl foodBowl = new Bowl(50);
        catBarsik.eatFromBowl(foodBowl);


        Cat[] cats = {
                new Cat("Васька", 10),
                new Cat("Мурка", 15),
                new Cat("Снежок", 8),
                new Cat("Пушок", 12),
                new Cat("Рыжик", 9)
        };

        for (Cat cat : cats) {
            cat.eatFromBowl(foodBowl);
        }

        System.out.println("Осталось еды в миске: " + foodBowl.getFoodAmount());

        System.out.println("\nСостояние сытости котов:");
        for (Cat cat : cats) {
            if (cat.isSatiated()) {
                System.out.println(cat.getName() + " наелся");
            }
            else System.out.println(cat.getName() + " голодный");
        }

        allCount();

        // 2 задание:

        Figure circle = new Circle(2);
        Figure rectangle = new Rectangle(4, 6);
        Figure triangle = new Triangle(3, 4, 5);


        System.out.println("\nКруг:" +
                "\nПериметр: " + circle.getPerimeter() +
                "\nПлощадь: " + circle.getArea() +
                "\nЦвет заливки: " + circle.getFillColor() +
                "\nЦвет границы: " + circle.getBorderColor());


        System.out.println("\nПрямоугольник:" +
                "\nПериметр: " + rectangle.getPerimeter() +
                "\nПлощадь: " + rectangle.getArea() +
                "\nЦвет заливки: " + rectangle.getFillColor() +
                "\nЦвет границы: " + rectangle.getBorderColor());


        System.out.println("\nТреугольник:" +
                "\nПериметр: " + triangle.getPerimeter() +
                "\nПлощадь: " + triangle.getArea() +
                "\nЦвет заливки: " + triangle.getFillColor() +
                "\nЦвет границы: " + triangle.getBorderColor());
    }
}