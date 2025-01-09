package selpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign_175 {

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("befotemethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("test2");
	}
	@Test
	public void Test3()
	{
		System.out.println("test2");
	}
	
}
