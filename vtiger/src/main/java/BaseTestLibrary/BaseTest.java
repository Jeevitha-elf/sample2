package BaseTestLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.CreateNewProductPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.ProductListPage;

public class BaseTest {
	public static WebDriver driver;
	public HomePage home;
	public CreateNewProductPage cnp;
	public ProductListPage pls;


	@BeforeClass(alwaysRun=true)
	//navigate to the application
	public void openApp() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser launched successfully",true);
		HomePage home=new HomePage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		ProductListPage pls=new ProductListPage(driver);
		driver.manage().window().maximize();
		Reporter.log("window maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	

	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() throws EncryptedDocumentException, IOException {
		LoginPage lo=new LoginPage(driver);
		lo.login(driver,"./resource/Book1.xlsx");
		Reporter.log("Logged in successfully",true);
	}

	@AfterClass(alwaysRun=true)
	public void logout() {
		Reporter.log("Logged out successfully",true);
	}

	@AfterMethod(alwaysRun=true)
	public void closeApplication() throws InterruptedException {

		Thread.sleep(4000);
		driver.quit();

	}
}
