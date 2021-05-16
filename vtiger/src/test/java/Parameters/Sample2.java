package Parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import BaseTestLibrary.BaseTest;

public class Sample2 extends BaseTest {
	
		  @Test(groups="Adhoc")
		  @Parameters("msage")
		  public void demo1(@Optional("optional")String data) {
			  
			  
			  Reporter.log(data,true);
		  }
}

		  