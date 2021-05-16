import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.IRetryAnalyzerImplementation;

public class RetryAnalyzer {
	@Test(retryAnalyzer=IRetryAnalyzerImplementation.class)
		public void demo1() {
		Reporter.log("Test case 1 is running",true);
		Assert.fail();
	}
}
