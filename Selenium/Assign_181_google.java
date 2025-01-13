package TestngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_181_google {
	@Test
	public void  testgoogleAssert() {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	 WebElement search=driver.findElement(By.name("q"));
	 search.sendKeys("india" +Keys.ENTER);
	 Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com/");
}
}
