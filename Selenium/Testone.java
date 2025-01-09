package TestngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testone extends Assign_179parallel {
	@Test
	public void searchamazon() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		 Thread.sleep(5000);
		 search.sendKeys("mobile" +Keys.ENTER);
		
	}

}
