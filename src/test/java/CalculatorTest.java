import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3,2);
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.addNums());
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtractNums());
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiplyNums());
    }

    @Test
    public void canDivide(){
        assertEquals(1.5, calculator.divideNums(), 0.01);
    }

}
