package Lesson_5;

public class ArrayDataException extends Exception {
    private int row;
    private int col;

    public ArrayDataException(int row, int col) {
        super("Ошибка в ячейке [" + row + "][" + col + "]");
        this.row = row;
        this.col = col;
    }
}