package Lesson_4;

public class Bowl {
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
