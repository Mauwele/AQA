package Lesson_5;

public class Main {
    public static void main(String[] args) {

        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcess.processArray(testArray);
            System.out.println("Сумма элементов: " + result);

            //Тест
            System.out.println("\nДемонстрация ArrayIndexOutOfBoundsException:");
            String[] demoArray = {"a", "b", "c"};
            System.out.println(demoArray[5]);

        } catch (ArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.err.println("Ошибка данных: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка выхода за границы массива: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}