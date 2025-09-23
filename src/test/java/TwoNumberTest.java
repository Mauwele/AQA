import Lesson_7.TwoNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TwoNumberTest {
    private TwoNumber comparator;

    @BeforeMethod
    public void setUp() {
        comparator = new TwoNumber();
    }

    @Test
    public void testFirstNumberGreater() {
        assertEquals(comparator.compareNumbers(5, 3), "Первое число больше");
        assertEquals(comparator.compareNumbers(0, -1), "Первое число больше");
        assertEquals(comparator.compareNumbers(100, 99), "Первое число больше");
    }

    @Test
    public void testSecondNumberGreater() {
        assertEquals(comparator.compareNumbers(3, 5), "Второе число больше");
        assertEquals(comparator.compareNumbers(-1, 0), "Второе число больше");
        assertEquals(comparator.compareNumbers(99, 100), "Второе число больше");
    }

    @Test
    public void testNumbersEqual() {
        assertEquals(comparator.compareNumbers(5, 5), "Числа равны");
        assertEquals(comparator.compareNumbers(-3, -3), "Числа равны");
        assertEquals(comparator.compareNumbers(0, 0), "Числа равны");
        assertEquals(comparator.compareNumbers(1000, 1000), "Числа равны");
    }

    @Test
    public void testEdgeCases() {
        // Проверка с отрицательными числами
        assertEquals(comparator.compareNumbers(-5, -3), "Второе число больше");
        assertEquals(comparator.compareNumbers(-3, -5), "Первое число больше");

        // Проверка с нулем
        assertEquals(comparator.compareNumbers(0, 1), "Второе число больше");
        assertEquals(comparator.compareNumbers(1, 0), "Первое число больше");
    }
}
