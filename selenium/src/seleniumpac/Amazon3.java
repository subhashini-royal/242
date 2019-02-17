package seleniumpac;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon3 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://amazon.in");
		WebDriverWait w=new WebDriverWait(d,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("field-keywords")));
		d.manage().window().maximize();
		
		
		WebElement e=d.findElement(By.xpath("(//*[@class='nav-line-2'])[2]"));
		Actions a=new Actions(d);
		a.moveToElement(e).build().perform();
		
		Thread.sleep(2000);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Books & Audible"))).
		WebElement e1=d.findElement(By.xpath("//span[text()='Books & Audible']"));
		//d.findElement(By.xpath("//*[@aria-label='Books & Audible")).sendKeys("Books & Audible",Keys.ENTER);
		a.moveToElement(e1).build().perform();
		//a.clickAndHold(e1).build().perform();
		Thread.sleep(2000);
		WebElement e2=d.findElement(By.xpath("(//*[@class='nav-panel'])[29]/child::*[5]"));
		a.moveToElement(e2).build().perform();
		a.click().build().perform();
	    d.findElement(By.xpath("(//*[contains(@onload,'window.uet')])[3]")).click();
		d.findElement(By.xpath("(//*[contains(@onload,'window.uet')])[2]")).click();
		d.findElement(By.xpath("(//*[contains(@onload,'window.uet')])[3]")).click();
		d.findElement(By.xpath("//*[@class='nav-sprite nav-logo-base']")).click();
		d.quit();
		
	
	}

}
