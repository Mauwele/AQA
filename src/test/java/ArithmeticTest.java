import Lesson_7.Arithmetic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticTest {
    private Arithmetic calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Arithmetic();
    }

    @Test
    public void testAddition() {
        assertEquals(calculator.add(2, 3), 5);
        assertEquals(calculator.add(-2, 1), -1);
        assertEquals(calculator.add(-5, 5), 0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(calculator.subtract(3, 2), 1);
        assertEquals(calculator.subtract(1, 4), -3);
        assertEquals(calculator.subtract(5, 5), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(calculator.multiply(2, 3), 6);
        assertEquals(calculator.multiply(0, 5), 0);
        assertEquals(calculator.multiply(-2, 3), -6);
    }

    @Test
    public void testDivision() {
        assertEquals(calculator.divide(4, 2), 2.0, 0.001);
        assertEquals(calculator.divide(-2, 2), -1.0, 0.001);
        assertEquals(calculator.divide(5, 5), 1.0, 0.001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(5, 0);
    }
}
