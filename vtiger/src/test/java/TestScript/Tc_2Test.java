package TestScript;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseTestLibrary.BaseTest;
import pomRepository.CreateNewProductPage;
import pomRepository.HomePage;
import pomRepository.ProductListPage;

public class Tc_2Test extends BaseTest {
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
    cnp.getSaveButton().click();
    Alert popup= driver.switchTo().alert();
	  String popupMsg = popup.getText();
    if(popupMsg.equals("Product Name cannot be empty")) {
    	Reporter.log("Alert popup is displayed",true);
    }
    else
    	Reporter.log("Alert popup is not displayed",true);
    popup.accept();
  //Logout
    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement a = driver.findElement(By.xpath("//a[text()='Sign Out']"));
    js.executeScript("arguments[0].click();",a);
    WebElement login = driver.findElement(By.id("submitButton"));
    if(login.isDisplayed()) {
 	   Reporter.log("login page is displayed",true);
    }
    else
 	   Reporter.log("login page is not displayed",true);
    }
}
