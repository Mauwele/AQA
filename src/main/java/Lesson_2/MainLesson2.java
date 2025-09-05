package Lesson_2;
import java.util.Scanner;
public class MainLesson2 {

    // 1.Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple//

    public static void printThreeWords() {
        System.out.println("\nOrange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/

    public static void checkSumSign() {
        int a = 2, b = -2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("\nСумма положительная");
        } else {
            System.out.println("\nСумма отрицательная");
        }
    }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”*/

    public static void printColor() {
        int value=0;

        if (value<=0) {
            System.out.println("\nКрасный");
        }
        else {
            if (value>0 && value<=100) {
                System.out.println("\nЖелтый");
            }
            else {
                System.out.println("\nЗеленый");
            }
        }

    }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/

    public static void compareNumbers() {
        int a=-3,b=-2;

        if (a>=b) {
            System.out.println("\na >= b");
        }
        else {
            System.out.println("\na < b");
        }

    }

    /* 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.*/

    public static void sum10to20() {

        int a,b;

        Scanner sum = new Scanner(System.in);
        System.out.print("\nВведите целое число a: ");
        a = sum.nextInt();

        System.out.print("Введите целое число b: ");
        b = sum.nextInt();

        if (a+b>=10 && a+b<=20) {
            boolean C = true;
            System.out.println("\n"+C);
        }
        else {
            boolean C = false;
            System.out.println("\n"+C);
        }

    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/

    public static void positiveOrNegative() {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите целое число: ");
        a = scan.nextInt();

        if (a>=0) {
            System.out.println("\nЧисло положительное");
        }
        else {
            System.out.println("\nЧисло отрицательное");
        }

    }

    /* 7. Напишите метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом.*/

    public static void positiveOrNegativeTrueOrFalse() {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите целое число: ");
        a = scan.nextInt();

        if (a>=0) {
            boolean c = false;
            System.out.println("\n" + c);
        }
        else {
            boolean c = true;
            System.out.println("\n" + c);
        }

    }

    /* 8. Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void stringXtimes() {

        int a;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nВведите целое число: ");
        a = scan.nextInt();

        if (a <= 0) {
            System.out.println("Количество должно быть положительным");
            return;
        }

        scan.nextLine();

        System.out.print("\nВведите строку: ");

        String stringText = scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println(stringText);
        }

    }

    /* 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    public static boolean checkYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }


    public static void checkYearFromUser() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите год для проверки: ");

        int year = scan.nextInt();

        if (year <= 0) {
            System.out.println("Год должен быть положительным числом!");
            return;
        }

        boolean result = checkYear(year);

        if (result) {
            System.out.println("\nВисокосный");
        } else {
            System.out.println("\nНе високосный");
        }
    }

    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void masive() {

        int [] nums = new int[] {1,1,0,0,1,0,1,1,0,0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                nums[i] = 0;
                System.out.print(nums[i]);
            }
            else if (nums[i] == 0){
                nums[i] = 1;
                System.out.print(nums[i]);
            }
        }
    }

    /* 11. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/

    public static void masive100() {

        int [] nums = new int[101];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
    }

    /* 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

    public static void masive6on2() {

        int [] nums = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6){
                nums[i] *= 2;
            }
            System.out.print(nums[i] + " ");
        }
    }

    /* 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];*/

    public static void matrix() {

        int [][] nums = new int[5][5] ;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i==j) {
                    nums[i][j] = 1;
                }
                if (i+j==4) {
                    nums[i][j] = 1;
                }
                System.out.print(" "+nums[i][j]);
                if (j == 4) {
                    System.out.println();
                }
            }
        }

    }

    /* 14. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.*/

    public static void matrixLen() {
        int len, initialValue;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        len = scan.nextInt();
        if (len <= 0) {
            System.out.println("Длинна должна быть положительным числом!");
            return;
        }
        int []nums = new int[len] ;

        System.out.print("Введите значение ячеек: ");
        initialValue = scan.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = initialValue;
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
//        sum10to20();
//        positiveOrNegative();
//        positiveOrNegativeTrueOrFalse();
//        stringXtimes();
//        checkYearFromUser();
//        masive();
//        masive100();
//        masive6on2();
//        matrix();
//        matrixLen();
    }
}