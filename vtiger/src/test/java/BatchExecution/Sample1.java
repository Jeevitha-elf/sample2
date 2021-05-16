package BatchExecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseTestLibrary.BaseTest;

import org.testng.Reporter;

  public class Sample1  extends BaseTest {
  @Test
  @Parameters("Browser")
  public void demo1(String data) {
	  Reporter.log(data,true);
	  //Reporter.log("Sample1 Executed",true);
  }
}
