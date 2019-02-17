package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose 
{
	public WebDriver driver;
	
	@FindBy(xpath="//*text()='COMPOSE']")
	public WebElement copm;

	
	public Compose(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	
	
	

}
