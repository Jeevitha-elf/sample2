package pomRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.ExcelLib;
public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(name="user_name")
private WebElement UsernameTextField;

@FindBy(name="user_password")
private WebElement PasswordTextField;

@FindBy(id="submitButton")
private WebElement LoginButton;

public WebElement getUsernameTextField() {
	return UsernameTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
      public void login(WebDriver driver,String abspath) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(abspath);
    		Workbook book = WorkbookFactory.create(fis);
    		ExcelLib  lib1=new ExcelLib();
    		String url = lib1.excel1(abspath,"Sheet1", 0, 0);
    		driver.get(url);
    		LoginPage lp= new LoginPage(driver);
    		String username = lib1.excel1(abspath,"Sheet1", 0, 1);
    		lp.getUsernameTextField().sendKeys(username);
    	    String password = lib1.excel1(abspath,"Sheet1", 0, 2);
    	    lp.getPasswordTextField().sendKeys(password);
    	    lp.getLoginButton().click();
   }
}




