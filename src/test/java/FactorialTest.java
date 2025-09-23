import Lesson_7.Factorial;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {
    private Factorial calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Factorial();
    }

    @Test
    public void testFactorial() {
        assertEquals(calculator.calculateFactorial(0), 1);
        assertEquals(calculator.calculateFactorial(1), 1);
        assertEquals(calculator.calculateFactorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeNumber() {
        calculator.calculateFactorial(-1);
    }
}
