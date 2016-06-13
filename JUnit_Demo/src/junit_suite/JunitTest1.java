package junit_suite;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitTest1 {
	
	@Test
	public void testAdd() {
	      //test data
	      int num= 5;
	      String str= "Junit is working fine";

	      //check for equality
	      assertEquals("Junit is working fine", str);
	      System.out.println("Assert Equals");
	            
	      
	      //check for false condition
	      assertFalse(num > 6);
	      System.out.println("Assert False");
	      
	      //check for not null value
	      assertNotNull(num);
	      System.out.println("Assert Not Null");
	}
}
