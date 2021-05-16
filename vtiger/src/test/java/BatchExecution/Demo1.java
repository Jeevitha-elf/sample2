package BatchExecution;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import genericLibrary.IAutoConstants;
import pomRepository.CreateNewProductPage;
import pomRepository.HomePage;
import pomRepository.ProductListPage;

public class Demo1  implements IAutoConstants{
	WebDriver driver;
	
	@Test()
		public void openApp() throws EncryptedDocumentException, IOException {
				System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
				driver=new FirefoxDriver();
			
			Reporter.log("Browser launched successfully",true);
			driver.manage().window().maximize();
			Reporter.log("window maximized successfully",true);

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	}


