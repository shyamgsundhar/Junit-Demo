import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}
