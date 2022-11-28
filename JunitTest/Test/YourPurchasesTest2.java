package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;

	@Test
	public void test() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		double expected = 1.5;
	   Assert.assertEquals(expected, aPurchase.getPurchase() , EPSILON);
		assertTrue(true);
	}
	
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double expected = 5;
	   Assert.assertEquals(expected, aPurchase.getPayment() , EPSILON);
		assertTrue(true);
	}
	
	@Test
	public void testCalculateChange2() {
		YourPurchases aPurchase = new YourPurchases();
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.5;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}	
	
	}

