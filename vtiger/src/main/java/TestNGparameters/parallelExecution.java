package TestNGparameters;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parallelExecution {
	@DataProvider(name="a",parallel=true)
	public String[] testData() throws EncryptedDocumentException, IOException {
		String[] a = {"https://www.facebook.com","https://www.instagram.com","https://www.google.com"};
		return a;
		}
	
		@Test(dataProvider="a")
		public void sample1(String data) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
				driver.get(data);
				Reporter.log(data,true);
			}
		}

