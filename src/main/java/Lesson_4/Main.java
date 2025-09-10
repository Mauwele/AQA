package Lesson_4;

public class Main {

    /* 1. Создать классы Собака и Кот с наследованием от класса Животное.

    Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

    Добавить подсчет созданных котов, собак и животных.

    Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:

    - Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    - Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
    - Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    - Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
    - Добавить метод, с помощью которого можно было бы добавлять еду в миску*/

    private static int animalCount = 0;
    private static int dogCount = 0;
    private static int catCount = 0;

    public static void allCount() {
        System.out.println("\nВсего:\nживотных: " + animalCount + " из них собак: " + dogCount + ", кошек: " + catCount);
    }

    public static class Bowl {
        private int foodAmount;

        public Bowl(int initialFood) {
            this.foodAmount = initialFood;
        }

        public void addFood(int amount) {
            if (amount > 0) {
                foodAmount += amount;
                System.out.println("Добавлено еды:" + amount);
            } else {
                System.out.println("Количество должно быть положительным");
            }
        }


        public int getFoodAmount() {
            return foodAmount;
        }


        public boolean eat(int amount) {
            if (foodAmount >= amount) {
                foodAmount -= amount;
                return true;
            }
            return false;
        }
    }

    public static class Animal {
        private String name;
        private int rangeOfMaxRun;
        private int rangeOfMaxSwim;

        public Animal(String name, int rangeOfMaxRun, int rangeOfMaxSwim) {
            this.name = name;
            this.rangeOfMaxRun = rangeOfMaxRun;
            this.rangeOfMaxSwim = rangeOfMaxSwim;
            animalCount++;
        }

        public Animal(String name) {
            this.name = name;
            animalCount++;
        }

        protected String getName() {
            return name;
        }

        public void run(int lengthOfObstacle) {
            if (lengthOfObstacle > 0 && lengthOfObstacle <= rangeOfMaxRun) {
                System.out.println(name + " пробежал: " + lengthOfObstacle + " м");
            } else if (lengthOfObstacle == 0) {
                System.out.println(name + " стоит на месте");
            } else {
                System.out.println(name + " не может столько пробежать");
            }
        }

        public void swim(int lengthOfObstacle) {
            if (lengthOfObstacle > 0 && lengthOfObstacle <= rangeOfMaxSwim) {
                System.out.println(name + " проплыл: " + lengthOfObstacle + " м");
            } else if (lengthOfObstacle == 0) {
                System.out.println(name + " не плывет");
            } else {
                System.out.println(name + " не может столько проплыть");
            }
        }

    }

    public static class Dog extends Animal {
        private static final int MAX_RUN = 500;
        private static final int MAX_SWIM = 10;

        public Dog(String name) {
            super(name, MAX_RUN, MAX_SWIM);
            dogCount++;
        }

        @Override
        public void run(int lengthOfObstacle) {
            if (lengthOfObstacle > 0 && lengthOfObstacle <= MAX_RUN) {
                System.out.println(getName() + " пробежал: " + lengthOfObstacle + " м");
            } else if (lengthOfObstacle == 0) {
                System.out.println(getName() + " стоит на месте");
            } else {
                System.out.println(getName() + " не может столько пробежать");
            }
        }

        @Override
        public void swim(int lengthOfObstacle) {
            if (lengthOfObstacle > 0 && lengthOfObstacle <= MAX_SWIM) {
                System.out.println(getName() + " проплыл: " + lengthOfObstacle + " м");
            } else if (lengthOfObstacle == 0) {
                System.out.println(getName() + " не плывет");
            } else {
                System.out.println(getName() + " не может столько проплыть");
            }
        }
    }

    public static class Cat extends Animal {
        private static final int MAX_RUN = 200;
        private static final int MAX_SWIM = 0;
        private boolean satiated;
        private int foodNeed;

        public Cat(String name, int foodNeed) {
            super(name, MAX_RUN, MAX_SWIM);
            this.foodNeed = foodNeed;
            this.satiated = false;
            catCount++;
        }

        public void eatFromBowl(Bowl bowl) {
            if (bowl.eat(foodNeed)) {
                satiated = true;
                System.out.println(getName() + " наелся");
            } else {
                System.out.println(getName() + " нехватает еды");
            }
        }

        public boolean isSatiated() {
            return satiated;
        }
    }

    /* 2. Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.

    Задать для каждой фигуры цвет заливки и цвет границы.

    Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
    Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.*/

    interface Figure {

        double getPerimeter();
        double getArea();
        String getFillColor();
        String getBorderColor();
    }

    static class Circle implements Figure {
        private double radius;
        private String fillColor;
        private String borderColor;

        public Circle(double radius) {
            this.radius = radius;
            this.fillColor = "Красный";
            this.borderColor = "Черный";
        }

        public double getPerimeter() {
            return 2 * 3.14 * radius;
        }

        public double getArea() {
            return 3.14 * radius * radius;
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }
    }

    static class Rectangle implements Figure {
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
            this.fillColor = "Синий";
            this.borderColor = "Черный";
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public double getArea() {
            return width * height;
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }
    }

    static class Triangle implements Figure {
        private double a;
        private double b;
        private double c;
        private String fillColor;
        private String borderColor;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.fillColor = "Зеленый";
            this.borderColor = "Черный";
        }

        public double getPerimeter() {
            return a + b + c;
        }

        public double getArea() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }
    }

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
