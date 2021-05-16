package Parameters;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseTestLibrary.BaseTest;

  public class Sample1 extends BaseTest {
  @Test(groups="Smoke")
  @Parameters("message")
  public void demo1(String data) {
	  
	  Reporter.log(data,true);
  }
}
