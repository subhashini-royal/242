package kwdpac;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class Kdm
{
public WebDriver driver;
public String launch(String l,String d,String c) throws Exception
{
	if(l.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(l.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\iedriverserver.exe");
		driver=new InternetExplorerDriver();
	}
	else
	{
		return("invalid browser");
	}
	Thread.sleep(10000);
	driver.get(d);
	Thread.sleep(1000);
	return("done");
}
	
	public String fill(String l,String d,String c) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath(l)).sendKeys(d);
		Thread.sleep(1000);
		return("done");
	}
	public String click(String l,String d,String c) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath(l)).click();
		Thread.sleep(1000);
		return("done");
	}
	public String validateuid(String l,String d,String c) throws Exception//it take
	{
		Thread.sleep(1000);
		try
		{
			if(c.equalsIgnoreCase("valid")&&driver.findElement(By.name("password")).isDisplayed())
			{
				return("done");
			}
			else if(c.equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
			{
				return("done");
			}
			else if(c.equalsIgnoreCase("blank")&&driver.findElement(By.xpath("//*[text()='Enter an email or phone number']")).isDisplayed())
			{
				return("done");
			}
			else
			{
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
				Date dt=new Date();
				String fname=sf.format(dt)+".png";
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File(fname);
				FileHandler.copy(src, dest);
				return("uids test failed and see"+fname);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return("done");
		}
	}
	public String close(String l,String d,String c) throws Exception
	{
		driver.close();
		return("done");	
	}
}


	
	
	
	
