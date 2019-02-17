package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class mercurytravels {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("http://newtours.demoaut.com");
	d.findElement(By.linkText("REGISTER")).click();
	d.findElement(By.name("firstName")).sendKeys("su");
	d.findElement(By.name("lastName")).sendKeys("royal");
	d.findElement(By.name("phone")).sendKeys("9550015016");
	d.findElement(By.id("userName")).sendKeys("subhashini21221@gmail.com");
	d.findElement(By.name("address1")).sendKeys("7AP");
	d.findElement(By.name("address2")).sendKeys("hyd");
	d.findElement(By.name("city")).sendKeys("MPL");
	d.findElement(By.name("state")).sendKeys("AP");
	d.findElement(By.name("postalCode")).sendKeys("510390");
	WebElement e=d.findElement(By.name("country"));
	Select s=new Select(e);
	s.selectByVisibleText("INDIA");
	e.getText();
	Thread.sleep(1000);
	d.findElement(By.name("email")).sendKeys("subhashini21221@gmail.com");
	d.findElement(By.name("password")).sendKeys("subhashinimca");
	d.findElement(By.name("confirmPassword")).sendKeys("subhashinimca");
	d.findElement(By.name("register")).click();	
	d.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
