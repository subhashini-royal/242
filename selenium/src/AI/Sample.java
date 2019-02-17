package AI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--use-fake-ui-for-media-Stream=1");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.co.in");
		//Thread.sleep(5000);
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Search by voice']")));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@aria-label='Search by voice']")).click();
		Thread.sleep(5000);
		
		
		
	
		

	}

}
