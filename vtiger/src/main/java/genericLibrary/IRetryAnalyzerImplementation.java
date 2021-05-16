package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImplementation implements IRetryAnalyzer {
	int count=0;
	int retryCount=3;
	public boolean retry(ITestResult result) {
		
		if(count>retryCount) {
			count++;
			return true;
		}
		return false;
	}

}
