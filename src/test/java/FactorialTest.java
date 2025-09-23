import Lesson_7.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    private Factorial calculator = new Factorial();

    @Test
    void testFactorial() {
        assertEquals(1, calculator.calculateFactorial(0));
        assertEquals(1, calculator.calculateFactorial(1));
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateFactorial(-1));
    }
}
