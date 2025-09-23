import Lesson_7.Arithmetic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    private Arithmetic calculator;

    @BeforeEach
    void setUp() {
        calculator = new Arithmetic();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 должно быть равно 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 должно быть равно -1");
        assertEquals(0, calculator.add(-5, 5), "-5 + 5 должно быть равно 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 должно быть равно 1");
        assertEquals(-3, calculator.subtract(1, 4), "1 - 4 должно быть равно -3");
        assertEquals(0, calculator.subtract(5, 5), "5 - 5 должно быть равно 0");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 должно быть равно 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 должно быть равно 0");
        assertEquals(-6, calculator.multiply(-2, 3), "-2 * 3 должно быть равно -6");
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(4, 2), 0.001, "4 / 2 должно быть равно 2.0");
        assertEquals(-1.0, calculator.divide(-2, 2), 0.001, "-2 / 2 должно быть равно -1.0");
        assertEquals(1.0, calculator.divide(5, 5), 0.001, "5 / 5 должно быть равно 1.0");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0),
                "При делении на ноль должно выбрасываться исключение");
    }
}
