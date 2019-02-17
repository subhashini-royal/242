package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W2sms {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.way2sms.com");
		//WebDriverWait w=new WebDriverWait(d,20);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
		//d.findElement(By.id("mobileNo")).sendKeys("9550015016");
		Thread.sleep(5000);
		d.close();

	}

}
