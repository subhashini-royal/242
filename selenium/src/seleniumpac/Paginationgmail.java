package seleniumpac;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Paginationgmail {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid uid");
		String uid=sc.nextLine();
		System.out.println("Enter valid pwd");
		String pwd=sc.nextLine();
		//
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		driver.findElement(By.name("identifier")).sendKeys(uid);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys(pwd);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
		driver.findElement(By.xpath("//*[text()='Next']")).clear();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Compose']")));
		//calculate
		/*
		int enoam=0;
		while(2>1)
		{
			int noamp=driver.findElement(By.xpath("//*(table)[4]/tbody/tr")).getSize();
			enoam=enoam+noamp;
			//go to text
			try
			{
		
			if (driver.findElement(By.xpath("//*[@aria-label='Older']")).getAttribute("aria-disabled").equals("true"))
			{
				break;
			}
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//*[@aria-label='Older']")).click();
				Thread.sleep(2000);
			}
		}*/
		System.out.println();
		
		
	}

}
