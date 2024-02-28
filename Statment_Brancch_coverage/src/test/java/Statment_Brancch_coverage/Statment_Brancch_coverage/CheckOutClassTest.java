package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckOutClassTest {

	@Test
	public void testCheckOut1() 
	{
		double cart=1000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.gold;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut2() 
	{
		double cart=4000;
		int creditRating=700; 
		statusClass.Status status = statusClass.Status.gold;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut3() 
	{
		double cart=4000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.gold;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertFalse(result);
	}
	
	@Test
	public void testCheckOut4() 
	{
		double cart=1000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.silver;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut5() 
	{
		double cart=4000;
		int creditRating=900; 
		statusClass.Status status = statusClass.Status.silver;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut6() 
	{
		double cart=5000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.silver;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertFalse(result);
	}
	
	@Test
	public void testCheckOut7() 
	{
		double cart=1000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.bronze;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut8() 
	{
		double cart=2000;
		int creditRating=900; 
		statusClass.Status status = statusClass.Status.bronze;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertTrue(result);
	}
	
	@Test
	public void testCheckOut9() 
	{
		double cart=2000;
		int creditRating=600; 
		statusClass.Status status = statusClass.Status.bronze;
        boolean result = CheckOutClass.CheckOut(cart,creditRating,status);
        assertFalse(result);
	}

}
