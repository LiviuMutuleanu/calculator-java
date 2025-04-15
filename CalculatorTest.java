import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testRun_Addition() {
        assertEquals("5.0", Calculator.myRun("2+3"));
    }

    @Test
    public void testRun_Subtraction() {
        assertEquals("2.0", Calculator.myRun("5-3"));
    }

    @Test
    public void testRun_Multiplication() {
        assertEquals("6.0", Calculator.myRun("2*3"));
    }

    @Test
    public void testRun_Division() {
        assertEquals("2.0", Calculator.myRun("6/3"));
    }

    @Test
    public void testRun_ComplexExpression() {
        assertEquals("3.0", Calculator.myRun("2+3*1-2/1"));
    }

    @Test
    public void testRun_DivisionByZero() {
        assertEquals("ERROR", Calculator.myRun("6/0"));
    }

    @Test
    public void testRun_InvalidExpression() {
        assertEquals("ERROR", Calculator.myRun("2&3"));
    }

    @Test
    public void Daniel_Test() {
        assertEquals("41.0", Calculator.myRun("7*7-7"));
    }
}