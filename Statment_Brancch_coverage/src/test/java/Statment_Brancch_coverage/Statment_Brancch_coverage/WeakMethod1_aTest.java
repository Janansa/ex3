package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for WeakMethod1 to achieve less than 100% statement coverage and reveal the division by zero error.
 */

public class WeakMethod1_aTest {
	
	@Test(expected = java.lang.ArithmeticException.class)
    public void weakMethod1_a_test() {
		int a = 6;
		int b = 0;
		WeakClass.weakMethod1(a, b);

    }

}
