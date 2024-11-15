import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    public void testAddition(){
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.add(1,2);
        assertEquals(3,result);
    }
}
