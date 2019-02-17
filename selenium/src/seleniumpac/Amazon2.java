package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon2 {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://amazon.in");
		WebDriverWait w=new WebDriverWait(d,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("field-keywords")));
		d.manage().window().maximize();
		
		String l=d.findElement(By.xpath("//*[@aria-label='Amazon']")).getText();
		System.out.println("link is verified " +l);
		
		d.findElement(By.name("field-keywords")).sendKeys("Fossil Q FTW2108 Marshal Digital Multi-Colour Dial Men's Watch");
		d.findElement(By.className("nav-input")).click();
		
		String b=d.findElement(By.className("textContainer__text")).getText();
		System.out.println("Search result is verified  "+b);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className("mediaCentralImage imageContainer__image")));
		d.findElement(By.xpath("(//div[@id='centerPlus'])/following::img[1]")).click();
		
		//d.findElement(By.name("submit.add-to-cart")).click();
		d.findElement(By.name("submit.add-to-cart")).click();
		// javascript Executor
		//JavascriptExecutor js=(JavascriptExecutor)d;
		//js.executeScript("document.getElementById("add-to-cart-button").click();");
		//js.executeScript("arguments[0].click();",e);
		
		//actions class methods
		//Actions a=new Actions(d);
		//a.click(e).build().perform();
		
		//it is working
		//Screen s=new Screen();
		//s.click("E:\\amma\\Addtocart.png");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-labelledby='submit.add-to-cart-announce']")));
		WebElement c=d.findElement(By.xpath("//*[@aria-labelledby='submit.add-to-cart-announce']"));
		c.click();
		//d.findElement(By.name("email")).sendKeys("subhashini21221@gmail.com");
		//d.findElement(By.name("password")).sendKeys("holly4");
		

	}

}
