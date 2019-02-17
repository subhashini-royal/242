package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Homepage;
import pages.Loginpage;

public class Gmailtest1
{

	public static void main(String[] args) throws Exception 
	{
		File f=new File("E:\\amma\\gmailtest1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		ExtentReports er=new ExtentReports("gmailpom.html",false);
		ExtentTest et=er.startTest("gmail uid test");
		
		String l="";
		while((l=br.readLine())!=null)
		{
			String p[]=l.split(",");
			
			System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			
			Homepage hp=new Homepage(driver);
			Loginpage lp=new Loginpage(driver);
			
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOf(hp.uid));
			hp.filluid(p[0]);
			w.until(ExpectedConditions.elementToBeClickable(hp.uidnext));
			hp.clickuidnext();
			Thread.sleep(5000);
			
			
			try 
			{
				if(p[0].length()==0&&hp.uidblankerr.isDisplayed())
				{
					et.log(LogStatus.PASS,"blank uid test passed");
				}
				
				else if(p[1].equalsIgnoreCase("invalid")&&hp.uidinvaliderr.isDisplayed())
				{
					et.log(LogStatus.PASS,"invalid uid test passed");
				}
				
				else if(p[1].equalsIgnoreCase("valid")&& lp.pwd.isDisplayed())
				{
					et.log(LogStatus.PASS,"valid uid test passed");
				}
				
				else
				{
					Date dt=new Date();
					SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
					String fname=df.format(dt);
					File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest=new File("fname");
					FileHandler.copy(f1,dest);
					et.log(LogStatus.FAIL, "uid test failed"+et.addScreenCapture(fname));
				}		
				
			}//try
			catch(Exception ex)
			{
				et.log(LogStatus.ERROR,ex.getMessage());
			}
			driver.close();
		}//while
		br.close();
		fr.close();
		
		er.endTest(et);
		er.flush();
	}
		

	}


