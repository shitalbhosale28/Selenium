package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_relativpat_As_157 {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 WebElement el=driver.findElement(By.xpath("//input[@name='q']"));
		 el.sendKeys("mobile");
		 el.sendKeys(Keys.ENTER);
		
	}

}
