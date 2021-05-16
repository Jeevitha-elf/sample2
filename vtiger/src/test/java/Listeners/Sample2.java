package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import BaseTestLibrary.BaseTest;
import genericLibrary.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class Sample2 extends BaseTest {
	
		  @Test(groups="Adhoc")
		  public void demo1() {
			  
			  Reporter.log("Sample2 Executed",true);
			  Assert.fail();
		  }
}

		  