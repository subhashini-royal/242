package seleniumpac;

import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;

public class Sikulix_sample {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\amma\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.co.in");
		d.manage().window().maximize();
		Screen s=new Screen();
		//s.click("dolphin.png");
		s.click("Bookmark.png");

	}

}
