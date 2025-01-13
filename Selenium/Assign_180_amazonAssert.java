package TestngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_180_amazonAssert {
	@Test
	public void TestCasesignin() throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		 WebElement email=driver.findElement(By.id("ap_email"));
		 email.sendKeys("shital.bhosale@hotmail.com");
		 WebElement continuebuttn= driver.findElement(By.id("continue"));
		 continuebuttn.click();
		 Thread.sleep(5000);
	WebElement pass=driver.findElement(By.id("ap_password"));
	Thread.sleep(5000);
	pass.sendKeys("Amazon@2025");
	 WebElement signin=driver.findElement(By.id("signInSubmit"));
	 signin.click();
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	 Thread.sleep(4000);
	
Assert.assertEquals(search.isDisplayed(), true);
	}
}
