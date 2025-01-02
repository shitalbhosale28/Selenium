package selpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Addtocart_assign164 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes" + Keys.ENTER);
		WebElement shoe = driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[2]"));
		shoe.click();
		Thread.sleep(5000);
		Set<String> pcid = driver.getWindowHandles();
		Iterator i1 = pcid.iterator();
		String parent = (String) i1.next();
		String child = (String) i1.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		Thread.sleep(8000);
		WebElement addbut = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		Thread.sleep(2000);
		addbut.click();
		Thread.sleep(2000);
		WebElement placeorder = driver.findElement(By.xpath("//span[.='Place Order']"));
		placeorder.click();
		
	WebElement email=	driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("9890311059");
	 WebElement cont=driver.findElement(By.xpath("//span[.='CONTINUE']"));
	 cont.click();
	  
	
		driver.close();

	}

}
