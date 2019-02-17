package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_dropdown_div {

	public static void main(String[] args)throws Exception {

		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://sematic-ui.com/modules/dropdown.html");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		Actions a=new Actions(d);
		a.click().build().perform();
		Thread.sleep(2000);
		a.sendKeys("f").build().perform();//choose female
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
