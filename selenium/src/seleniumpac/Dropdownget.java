package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownget {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		d.switchTo().frame("iframeResult");
		WebElement e=d.findElement(By.name("cars"));
		Select s=new Select(e);
		Thread.sleep(5000);
		int x=s.getOptions().size();
		System.out.println("total count"+x);
		
			Actions a=new Actions(d);
			a.keyDown(Keys.CONTROL).build().perform();
			a.click(s.getOptions().get(2)).build().perform();
			Thread.sleep(5000);
			a.click(s.getOptions().get(3)).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			
			int y=s.getAllSelectedOptions().size();
			System.out.println("selected count"+y);
			String z=s.getFirstSelectedOption().getText();
			System.out.println(z);
			//d.close();
			
			
		
	}

}
