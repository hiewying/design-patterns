package kerryvending;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
//import org.testng.annotations.Test;

public class VendingMachineTest {

	@Test
	public void dropCoin() { //add coin and select product
		vendingExample VM = new vendingExample();
		int balance=0;
		assertEquals(100,VM.drop("DOLLAR",balance));
		assertEquals(125,VM.drop("QUARTER",balance+100));
		assertEquals(135,VM.drop("DIME",balance+100+25));
	}

	
	@Test
	public void selectProducts() { //add coin and select product
		vendingExample VM = new vendingExample();
		int balance=150;
		assertEquals(50,VM.choose("PEPSI",balance));
		assertEquals(85,VM.choose("COFFEE",balance));
		assertEquals(100,VM.choose("TEA",balance));
	}
	
}
