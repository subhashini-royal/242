package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.gmail.com");
		d.findElement(By.name("identifier")).sendKeys("subhashini8h4d");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(500);
		d.findElement(By.name("password")).sendKeys("hdn52542nnusr");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		
		
		
		

	}

}
