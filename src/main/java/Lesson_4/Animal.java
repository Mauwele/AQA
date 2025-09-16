package Lesson_4;

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

public class Animal {

    static int animalCount = 0;
    static int dogCount = 0;
    static int catCount = 0;

    public static void allCount() {
        System.out.println("\nВсего:\nживотных: " + animalCount + " из них собак: " + dogCount + ", кошек: " + catCount);
    }

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
