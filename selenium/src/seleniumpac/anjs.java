package seleniumpac;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class anjs {

	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a value");
		String x=c.nextLine();
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://angularjs.org");
		WebDriverWait w=new WebDriverWait(d,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) d;
		WebElement e=d.findElement((By.xpath("//*[@ng-model='yourName']")));
		js.executeScript("arguments[0].scrollIntoView();",e);
		d.findElement(By.xpath(""));
		if(x.contains(x))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		// TODO Auto-generated method stub
		d.close();
	}
	

}
