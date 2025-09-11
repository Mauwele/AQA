package Lesson_4;

public class Cat extends Animal {
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
