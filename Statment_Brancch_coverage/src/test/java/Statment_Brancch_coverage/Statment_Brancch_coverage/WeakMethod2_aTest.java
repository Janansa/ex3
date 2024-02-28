package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

/**
 * Unit test for WeakMethod2 to achieve less than 100% branch coverage and reveal the division by zero error.
 */

public class WeakMethod2_aTest {
	
	@Test(expected = java.lang.ArithmeticException.class)
    public void weakMethod2_a_test() {
		int a = 6;
		int b = 0;
		WeakClass.weakMethod2(a, b);

    }

}
