package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	public static double weakMethod1 (int a, int b) 
	{
		if (b != 0 || a > 10) {
            a += 1;
        }
		a += 2;

		return a / b;
		
	}
	
	public static double weakMethod2 (int a, int b) 
	{
		if (a == 0)
		{
			a += 2;
		}
		else {
			a += 3;
		}
		return a/b;
	}
	
	public static double weakMethod3 (int a, int b) 
	{
		if (a == 0 || b > 1)
		{
			a += 3;
		}
		a += 1;
		
		return a/b;
	}
	
	public static double weakMethod4 (int a, int b) 
	{
		if (a == 0 || b > 10)
		{
			a += 3;
		}
		else {
			a += 2;
		}
		return a/b;
	}

}
