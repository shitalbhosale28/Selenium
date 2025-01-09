package TestngAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Assign_179parallel {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	 public void launchbrowser(String nameofbrowser) throws InterruptedException
	 {
		if(nameofbrowser.equals("chrome"))
		{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
	 }
		if(nameofbrowser.equals("firefox"))
		{
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	 }
		if(nameofbrowser.equals("edge"))
		{
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		}
	 }
	@AfterMethod
	 public void quitbrowser()
	 {
driver.quit();

	 }
}
