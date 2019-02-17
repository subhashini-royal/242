package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.naukri.com");
	d.findElement(By.xpath("(//*[text()='Login'])[1]")).click();
	d.findElement(By.name("email")).sendKeys("subhashini21221");
	d.findElement(By.name("PASSWORD")).sendKeys("subhashini1995");
	Thread.sleep(500);
	d.findElement(By.className("blueBtn")).click();
	d.close();
	

	}

}
