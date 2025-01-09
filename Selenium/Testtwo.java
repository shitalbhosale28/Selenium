package TestngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testtwo extends Assign_179parallel {
@Test
public void linkamazon() throws InterruptedException
{
	Thread.sleep(2000);
	 WebElement link=driver.findElement(By.linkText("Sell"));
	 Thread.sleep(4000);
	link.click();
}
}
