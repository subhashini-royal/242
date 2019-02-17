package AI;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class S3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter text");
	    String x=sc.nextLine();
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("use-fake-ui-for-media-stream=1");
	    System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver(co);
		cd.manage().window().maximize();
		cd.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(cd,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='hb2Smf']")));
		cd.findElement(By.xpath("//*[@class='hb2Smf']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("spchb"))); 
		VoiceManager vm=VoiceManager.getInstance();
	    System.setProperty("mbrola.base","E:\\amma\\mbrola\\mbrola");
	    Voice v=vm.getVoice("mbrola_us1");
	    v.allocate();
	    v.speak(x);
	    v.deallocate();
	   
	}

}
