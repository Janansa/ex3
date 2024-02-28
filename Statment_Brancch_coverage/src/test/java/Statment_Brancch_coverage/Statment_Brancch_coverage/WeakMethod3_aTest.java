package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for WeakMethod3 to achieve 100% statement coverage and less than 100% branch coverage 
 * but not reveal the division by zero error
 */

public class WeakMethod3_aTest {
	
	@Test
    public void weakMethod3_a_test() 
    {
    	int a = 0;
    	int b = 2;
    	double expected = 2.0;
        double result = WeakClass.weakMethod3(a, b);
        assertEquals(expected, result,0.0001);
    }

}
