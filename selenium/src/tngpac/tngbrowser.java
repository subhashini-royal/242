package tngpac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tngbrowser
{
	//right-click -->Run-as-->test-NG
	
	
	
	/*
	setup system for choice
login in to app
launch the browser
enter URL
google title test
logout from app
close browser
delete all cookies
	 * 
	 */
	
	/*
	 * setup system for choice
login in to app
launch the browser
enter URL			//@BeforeMethod
google logo test	//Test-1
logout from app		//@AfterMethod
enter URL           //@BeforeMethod
google title test   //@Test-2
logout from app     //@AfterMethod
enter URL			//@BeforeMethod
search test			//@Test-3
logout from app		//@AfterMethod
close browser  		
delete all cookies	
	 * 
	 */
	
	
	
	//pre-condition annotations    //starting with after
	@BeforeSuite //1
	public void setUp()
	{
	System.out.println("@BeforeSuite....setup system for choice");
	}
	  
	
	@BeforeTest//2
	public void login()
	{
		System.out.println("@BeforeTest....login in to app");
	}
	
	
	
	@BeforeClass//3
	public void launchBrowser()
	{
		System.out.println("@BeforeClass....launch the browser");
	}
	
	
	@BeforeMethod//4
	public void enterURL()
	{
		System.out.println("@BeforeMethod....enter URL");
	}
	
	//test case   //starting with test
	@Test//5
	public void googleTitleTest()
	{
		System.out.println("google title test");
		
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("search test");
	}
	
	@Test
		public void googleLogoTest()
		{
			System.out.println("google logo test");
		}
	
	//post-conditions  //starting with after
	
	@AfterMethod//6
	public void logOut()
	{
		System.out.println("@BeforeMethod....logout from app");
	}
	
	
	@AfterClass//7
	public void classBrowser()
	{
		System.out.println("@AfterClass....close browser");
	}
	
	
	@AfterTest//8
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}

	
	
	/*
	 * 
	 * 
	 
	
	@AfterSuite//9
	public void generateTestRequest()
	{
	System.out.println("generate test request");	
	}
	*/
}
