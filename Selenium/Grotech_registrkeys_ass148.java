package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_registrkeys_ass148 {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	WebElement skilldrop=	driver.findElement(By.id("Skills"));
		//WebElement el1=driver.findElement(By.tagName("div"));
		
		
	skilldrop.sendKeys(Keys.DOWN);
	//skilldrop.sendKeys(Keys.DOWN);
	//skilldrop.sendKeys(Keys.DOWN );
	skilldrop.sendKeys(Keys.ENTER);
	
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)", "");
		//js.executeScript("document.body.style.zoom='70%'", "");
	

		

	}

}
