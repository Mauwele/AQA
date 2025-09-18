package Lesson_5;

public class ArrayProcess {

    public static int processArray(String[][] array)
            throws ArraySizeException, ArrayDataException {

        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    // Пытаемся преобразовать в int
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если не удалось - бросаем исключение с координатами
                    throw new ArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
