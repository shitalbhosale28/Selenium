package TestngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_183_amazonlogoutassert {
	@Test
	public void testLogout() throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("shital.bhosale@hotmail.com");
		WebElement continuebuttn = driver.findElement(By.id("continue"));
		continuebuttn.click();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("ap_password"));
		Thread.sleep(5000);
		pass.sendKeys("Amazon@2025");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Actions a1 = new Actions(driver);
		WebElement el = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a1.moveToElement(el).perform();
		WebElement signout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		Assert.assertEquals(username.isDisplayed(), true);
		/*JavascriptExecutor js = driver;
		js.executeScript("windows.scrollBy(0,400)");

		// js.executeScript("window.scrollBy(2655)");
		Thread.sleep(4000);

		WebElement signout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		a1.moveToElement(signout).click().perform();
		Point p = signout.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);*/
	}
}
