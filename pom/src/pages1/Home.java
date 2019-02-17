package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
public WebDriver driver;
	
	@FindBy(name="identifier")
	public WebElement uid;
	@FindBy(xpath="//*text()='Next']")
	public WebElement uidnext;
	
	@FindBy(name="//*[contains(text(),'Enter an email')]")
	public WebElement blankuiderr;
	@FindBy(name="/(/*[contains(text(),'find your Google')])[2]")
	public WebElement invaliduiderr;
	
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void filluid(String x)
	{
		uid.sendKeys(x);
	}
	public void clickuidnext()
	{
		uidnext.click();
	}
	
}
