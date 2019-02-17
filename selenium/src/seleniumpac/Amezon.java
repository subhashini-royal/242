package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;


public final class Amezon {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://amazon.in");
		WebDriverWait w=new WebDriverWait(d,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("field-keywords")));
		d.manage().window().maximize();
		
		String a=d.findElement(By.xpath("//*[@aria-label='Amazon']")).getText();
		System.out.println("link is verified " +a);
		
		d.findElement(By.name("field-keywords")).sendKeys("Fossil Q FTW2108 Marshal Digital Multi-Colour Dial Men's Watch");
		d.findElement(By.className("nav-input")).click();
		
		String b=d.findElement(By.className("textContainer__text")).getText();
		System.out.println("Search result is verified  "+b);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className("mediaCentralImage imageContainer__image")));
		d.findElement(By.xpath("(//div[@id='centerPlus'])/following::img[1]")).click();
		Thread.sleep(2000);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='a-button-input'])[6]")));
		Screen s=new Screen();
		s.click("E:\\amma\\Addtocart.png");
		Thread.sleep(2000);
		
		String c=d.findElement(By.xpath("//*[text()='1']")).getText();
		System.out.println("card 1 is verified  "+c);
		
		d.quit();
	}

}
