package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for WeakMethod4 to achieve 100% branch coverage but not reveal the division by zero error
 */
public class WeakMethod4_aTest {

	@Test
	public void weakMethod4_a1_test() {
		int a = 17;
    	int b = 20;
    	double expected = 1.0;
        double result = WeakClass.weakMethod4(a, b);
        assertEquals(expected, result,0.0001);
	}
	
	@Test
	public void weakMethod4_a2_test() {
		int a = 5;
    	int b = 1;
    	double expected = 7.0;
        double result = WeakClass.weakMethod4(a, b);
        assertEquals(expected, result,0.0001);
	}

}
