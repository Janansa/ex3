package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for WeakMethod3 to achieve 100% branch coverage and reveal the division by zero error.
 */

public class WeakMethod3_bTest {

	@Test(expected = java.lang.ArithmeticException.class)
    public void weakMethod3_b1_test() {
		int a = 0;
		int b = 0;
		WeakClass.weakMethod3(a, b);
	}
	
	@Test
    public void weakMethod3_b2_test() 
    {
    	int a = 5;
    	int b = 1;
    	double expected = 6.0;
        double result = WeakClass.weakMethod3(a, b);
        assertEquals(expected, result,0.0001);
    }

}


