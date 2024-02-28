package Statment_Brancch_coverage.Statment_Brancch_coverage;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for WeakMethod2 to achieve 100% branch coverage but not reveal the division by zero error
 */

public class WeakMethod2_bTest {
	
	@Test
    public void weakMethod2_b1_test() 
    {
    	int a = 0;
    	int b = 2;
    	double expected = 1.0;
        double result = WeakClass.weakMethod2(a, b);
        assertEquals(expected, result,0.0001);
    }
    
    @Test
    public void weakMethod2_b2_test() {
    	int a = 11;
    	int b = 7;
    	double expected = 2.0;
        double result = WeakClass.weakMethod2(a, b);
        assertEquals(expected, result,0.0001);
    }

}
