package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.name("email")).sendKeys("9550015016");
		d.findElement(By.name("pass")).sendKeys("facebook9550015016");
		
		
		
		d.findElement(By.id("u_0_2")).click();
		d.findElement(By.name("q")).sendKeys("Mind Q Systems");
		// TODO Auto-generated method stub

	}

}
