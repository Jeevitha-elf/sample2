package TestScript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseTestLibrary.BaseTest;
import pomRepository.CreateNewProductPage;
import pomRepository.HomePage;
import pomRepository.ProductListPage;

public class Tc_5Test extends BaseTest{
	@Test
	public void loginTest() {
		WebElement products = driver.findElement(By.linkText("Products"));

		if(products.isDisplayed()) {
			Reporter.log("Home page is displayed",true);
		}
		else
			Reporter.log("Home page is not displayed",true);

		//Place the mouse cursor on "Product" and click on Product link
		HomePage hp=new HomePage(driver);
		hp.home(driver);
		WebElement productList = driver.findElement(By.xpath("//img[@alt='Create Product...']"));
		if(productList.isDisplayed()) {
			Reporter.log("Product List page is displayed",true);
		}
		else
			Reporter.log("Product List page is not displayed",true);


		//naviagate to "create new Product"page by click on "+" image
		ProductListPage pls=new ProductListPage(driver);
		pls.getNewProduct().click();
		WebElement createNewProduct = driver.findElement(By.xpath("//span[.='Creating New Product']"));
		if(createNewProduct.isDisplayed()) {
			Reporter.log("New Product page is displayed",true);
		}
		else
			Reporter.log("New Product page is not displayed",true);


		//create a Product and save
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		cnp.getProductName().sendKeys("Pendrive");
		cnp.getSaveButton().click();
		WebElement text = driver.findElement(By.xpath("//span[@class='lvtHeaderText']/.."));
		if(text.isDisplayed()) {
			System.out.println("Product is created with msg"+text.getText());
		}
		else
			System.out.println("Product is not created");
	}
}
