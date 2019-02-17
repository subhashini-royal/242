package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class Js1 
{

	public static void main(String[] args) throws Exception
	{
		//
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.engvid.com");
		WebElement e=d.findElement(By.xpath("//*[text()='Teachers']"));
		Actions a=new Actions(d);
		a.moveToElement(e).build().perform();
		Thread.sleep(1000);
		//d.findElement(By.linkText("https://www.engvid.com/english-teacher/james/")).click();
		WebElement l=d.findElement(By.linkText("https://www.engvid.com/english-teacher/james/"));
		//JavascriptExecutor js=(JavascriptExecutor) d;
		//js.executeScript("argument[0].click()",l);
		//js.executeScript("document.getElementById("nsadfg").click();")
		a.moveToElement(l).build().perform();
		a.click(l).build().perform();
		

	}

}
