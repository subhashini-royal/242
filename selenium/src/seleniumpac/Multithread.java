package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multithread extends Thread
{
	public void run()
	{

		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.gmail.com");
		try
		{
		d.findElement(By.name("identifier")).sendKeys("subhashini8h4d");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		
		d.findElement(By.name("password")).sendKeys("hdn52542nnusr");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		}
		catch(Exception e)
		{
			d.close();//it can close only one or active browser only
		}
		//code can write on try catch and after close site
		
		
		
	}

	public static void main(String[] args) 
	{
		Multithread mt=new Multithread();
		mt.start();
		//code can write on try catch and after close site

		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.naukri.com");
		d.findElement(By.xpath("(//*[text()='Login'])[1]")).click();
		d.findElement(By.name("email")).sendKeys("subhashini21221");
		d.quit();//it close 4 browsers or windows at a time
		

	}

}
