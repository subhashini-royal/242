package tngpac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.getTitle();
	}
	
	
	@Test
	public void googleTitleTest()
	{
		String t=driver.getTitle();
		System.out.println(t);
	}
	/*
	 * 
	
	
	@Test
	public void googleLogoTest()
	{
        driver.findElement(By.xpath("//*[@alt='Google']")).isDisplayed();
		
	}
	@Test
	public void gmailTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	 */
	
	
	@AfterMethod
	public void tearDown()
	{
	 driver.quit();
	}
	
	
}
