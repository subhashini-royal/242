package seleniumpac;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NIE {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter uid");
		String uid=sc.nextLine();
		System.out.println("Enter uidc");
		String uidc=sc.nextLine();
		if(uidc.equalsIgnoreCase("valid"))
		{
			System.out.println("Enter pwd");
			String pwd=sc.nextLine();
			System.out.println("Enter pwdc");
			String pwdc=sc.nextLine();
		}
		//automation

		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.gmail.com");
		d.findElement(By.name("identifier")).sendKeys(uid);
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(500);
		
		if(uid.equalsIgnoreCase("invalid") && d.findElement(By.name("identifier")).isDisplayed())
		{
			System.out.println("uid f");
		}
		else if(uid.equalsIgnoreCase("invalid") && d.findElement(By.xpath("")).isDisplayed())
		{
			System.out.println("uid p");
		}
		if(uid.equalsIgnoreCase("valid") && d.findElement(By.name("password")).isDisplayed())
		{
			System.out.println("uid test passed");
		}
		else if(uid.equalsIgnoreCase("valid") && d.findElement(By.xpath("")).isDisplayed())
		{
			
		}
		
			

	}

}
