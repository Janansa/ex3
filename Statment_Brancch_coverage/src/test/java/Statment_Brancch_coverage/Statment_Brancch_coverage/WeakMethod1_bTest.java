package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for WeakMethod1 to achieve 100% statement coverage but not reveal the division by zero error
 */

public class WeakMethod1_bTest {
	

	@Test
    public void weakMethod1_b2_test() {
    	int a = 6;
    	int b = 3;
    	double expected = 3.0;
        double result = WeakClass.weakMethod1(a, b);
        assertEquals(expected, result,0.0001);
    }

}
