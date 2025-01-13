package TestngAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_182_amazonsearchassert {
	@Test
	public void testproductassert() throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	 search.sendKeys("shoe"+Keys.ENTER);
	 Thread.sleep(4000);
	List<WebElement> l= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	 int size=l.size();
	 System.out.println(size);
	 Assert.assertEquals(l.size()>50, true);
	
	
}
}
