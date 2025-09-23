package Lesson_7;

public class TwoNumber {
    public String compareNumbers(int a, int b) {
        if (a > b) {
            return "Первое число больше";
        } else if (a < b) {
            return "Второе число больше";
        } else {
            return "Числа равны";
        }
    }
}
