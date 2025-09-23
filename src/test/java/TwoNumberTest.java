import Lesson_7.TwoNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoNumberTest {
    private TwoNumber comparator;

    @BeforeEach
    void setUp() {
        comparator = new TwoNumber();
    }

    @Test
    void testFirstNumberGreater() {
        assertEquals("Первое число больше", comparator.compareNumbers(5, 3));
        assertEquals("Первое число больше", comparator.compareNumbers(0, -1));
        assertEquals("Первое число больше", comparator.compareNumbers(100, 99));
    }

    @Test
    void testSecondNumberGreater() {
        assertEquals("Второе число больше", comparator.compareNumbers(3, 5));
        assertEquals("Второе число больше", comparator.compareNumbers(-1, 0));
        assertEquals("Второе число больше", comparator.compareNumbers(99, 100));
    }

    @Test
    void testNumbersEqual() {
        assertEquals("Числа равны", comparator.compareNumbers(5, 5));
        assertEquals("Числа равны", comparator.compareNumbers(-3, -3));
        assertEquals("Числа равны", comparator.compareNumbers(0, 0));
        assertEquals("Числа равны", comparator.compareNumbers(1000, 1000));
    }
}
