package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public WebDriver driver;
	
	@FindBy(name="password")
	public WebElement pwd;
	@FindBy(xpath="//*text()='Next']")
	public WebElement pwdnext;

	@FindBy(name="//*[text()='Enter a password']")
	public WebElement blankpwderr;
	@FindBy(name="//*[contains(text(),'Wrong password')]")
	public WebElement invalidpwderr;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fillpwd(String x)
	{
		pwd.sendKeys(x);
	}
	public void clickpwdnext()
	{
		pwdnext.click();
	}
}
