import Lesson_7.Triangle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleTest {
    private Triangle calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Triangle();
    }

    @Test
    public void testAreaCalculation() {
        assertEquals(calculator.calculateArea(4, 5), 10.0, 0.001);
        assertEquals(calculator.calculateArea(0, 5), 0.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeBase() {
        calculator.calculateArea(-1, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        calculator.calculateArea(5, -1);
    }
}
