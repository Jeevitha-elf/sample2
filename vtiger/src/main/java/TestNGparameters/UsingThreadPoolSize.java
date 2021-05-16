package TestNGparameters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class UsingThreadPoolSize {
	
	
	@Test(invocationCount=3,threadPoolSize=2)
	public void sample1() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.close();
		}
	}

