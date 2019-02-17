package tngpac;

import org.testng.annotations.Test;

public class Me1
{
	/*
	 * Suite
	 * Test
	 * Groups
	 * Methods
	 * @test
	 */
  @Test(priority=0)    //priority //in TestNG all methods can run alphabetic order
  public void a()                        //depends order 1.groups,2.method
  {
	  System.out.println("amma");
  }
  
  @Test(alwaysRun=false)
  public void aa()
  {
	  System.out.println("nana");
  }
  @Test(priority=2,enabled=false)          //to skip from execution
  public void e()                    
  {
	  System.out.println("sri rama");
  }
  
  @Test(priority=2,dependsOnMethods= {"a","aa"})
  public void aaa()
  {
	  System.out.println("me");
  }
  
  @Test(groups="1")
  public void bb()
  {
	  System.out.println("chinna annaya");
  }
  @Test(groups="2")
  public void b()
  {
	  System.out.println("pedda annaya");
  }
  @Test(dependsOnGroups= {"1","2"})
  public void bbb()
  {
	  System.out.println("su");
  }
  
  
  
  
  
}
