package TestNGparameters;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingInvocationCount {
	@Test(invocationCount=2)
		public void sample() {
		Reporter.log("Sample Executed",true);
	}
}
