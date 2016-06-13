package junit_suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner3 {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(JunitTest3.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result is " +result.wasSuccessful());
	}

}
