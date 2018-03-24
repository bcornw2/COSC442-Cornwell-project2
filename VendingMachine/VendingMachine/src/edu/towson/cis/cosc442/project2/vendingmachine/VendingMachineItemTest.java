/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BCC1117
 *
 */
public class VendingMachineItemTest {
	
	VendingMachineItem vendItem1, vendItem2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vendItem1 = new VendingMachineItem("Candy", 1.50);
		vendItem2 = new VendingMachineItem("Soda", 2.00);
	}
	

	@Test
	public void testVendingMachineItem_1()
		throws Exception {
		String name = "";
		double price = 1.0;

		VendingMachineItem result = new VendingMachineItem(name, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1.0, result.getPrice(), 1.0);
	}
	
	@Test
	public void testGetName() {
		
		String result1 = vendItem1.getName();
		assertEquals("Candy", result1);
		
		String result2 = vendItem2.getName();
		assertEquals("Soda", result2);
		
	}
	
	@Test
	public void testGetprice() {
		//double price = vendItem1.getPrice();
		assertEquals(1.50, vendItem1.getPrice(), 0.0001);
		assertEquals(2.00, vendItem2.getPrice(), 0.0001);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vendItem1 = null;
		vendItem2 = null;
	}
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	

}
