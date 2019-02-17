package AI;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Voice {

	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what you want listen");
		String x=sc.nextLine();//com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory
		//
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--use-fake-ui-for-media-Stream=1");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.co.in");
		//Thread.sleep(5000);
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Search by voice']")));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@aria-label='Search by voice']")).click();
		Thread.sleep(5000);
		
		System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		
		

		Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		Synthesizer s=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
		s.allocate();
		s.resume();
		s.speakPlainText(x ,null);
		s.waitEngineState(Synthesizer.QUEUE_EMPTY);
		s.deallocate();
		

	}

}
