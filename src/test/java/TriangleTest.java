import Lesson_7.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    private Triangle calculator = new Triangle();

    @Test
    void testAreaCalculation() {
        assertEquals(10.0, calculator.calculateArea(4, 5));
        assertEquals(0.0, calculator.calculateArea(0, 5));
    }

    @Test
    void testNegativeValues() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateArea(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateArea(5, -1));
    }
}
