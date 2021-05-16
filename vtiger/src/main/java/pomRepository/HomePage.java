package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(linkText="Products")
private WebElement Products;

    public WebElement getProducts() {
	 return Products;
    }
    
    public void home(WebDriver driver) {
    	WebElement element =getProducts();
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
    	getProducts().click();
    }
    
}
