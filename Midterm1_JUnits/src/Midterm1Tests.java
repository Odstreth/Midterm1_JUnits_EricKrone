import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.MyClass;


public class Midterm1Tests {

	@Test
	public void test() {
		assertTrue("Should be true", MyClass.ReturnTrue());
		assertEquals("Should be 10", 10, MyClass.AddTwoNumbers(7, 3));
		
	}

}
