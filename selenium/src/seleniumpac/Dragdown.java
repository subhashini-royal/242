package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dragdown {

	public static void main(String[] args) throws Exception {
	
	
			
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://jqueryui.com/droppable");
		//WebDriverWait w=new WebDriverWait(d,20);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.name("field-keywords")));
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.switchTo().frame(0);
		WebElement e1=d.findElement(By.id("draggable"));
		WebElement e2=d.findElement(By.id("droppable"));
		Actions a=new Actions(d);
		a.dragAndDrop(e1,e2).build().perform();
		Thread.sleep(5000);
		d.switchTo().defaultContent();
		d.close();
		

	}

}
