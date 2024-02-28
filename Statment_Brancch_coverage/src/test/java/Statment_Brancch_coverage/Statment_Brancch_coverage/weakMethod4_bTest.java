package Statment_Brancch_coverage.Statment_Brancch_coverage;



import org.junit.Test;

/**
 * Unit test for WeakMethod4 to achieve less than 100% statement coverage and reveal the division by zero error.
 */

public class weakMethod4_bTest {

	@Test(expected = java.lang.ArithmeticException.class)
    public void weakMethod4_b_test() {
		int a = 0;
		int b = 0;
		WeakClass.weakMethod4(a, b);

	}

}
