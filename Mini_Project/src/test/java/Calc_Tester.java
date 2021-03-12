import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Calc_Tester
{
    private Calc calc;

    @Test
    public void TruePositiveSqrt()
    {
        double result = calc.square_root(2);
        assertEquals(1.41,result,.2f);
    }

    @Test
    public void TrueNegativeSqrt()
    {
        double result = calc.square_root(2);
        assertNotEquals(2.41, result, .2f);
    }

    @Test
    public void TruePositiveFact()
    {
        double result = calc.factorial(5);
        assertEquals(120,result);
    }

    @Test
    public void TrueNegativeFact()
    {
        double result = calc.square_root(5);
        assertNotEquals(420, result);
    }

    @Test
    public void TruePositiveLog()
    {
        double result = calc.log_e(2);
        assertEquals(0.69,result,.2f);
    }

    @Test
    public void TrueNegativeLog()
    {
        double result = calc.log_e(2);
        assertNotEquals(0.41, result, .2f);
    }

    @Test
    public void TruePositivePow()
    {
        double result = calc.power(2,3);
        assertEquals(8,result);
    }

    @Test
    public void TrueNegativePow()
    {
        double result = calc.power(2,3);
        assertNotEquals(6, result);
    }
}
