package Lesson_4;

public class Dog extends Animal {
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