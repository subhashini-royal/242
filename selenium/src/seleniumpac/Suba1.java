package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suba1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		driver.findElement(By.name("mobileNo")).sendKeys("9550015016");
		Thread.sleep(5000);
		driver.close();

	}

}
