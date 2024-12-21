package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartautosugge_Assin163 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		 search.sendKeys("idcard");
		 Thread.sleep(5000);//for flipkart right click not works so freeze the console by going in resource
		 List<WebElement> l2= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		
	        int a=l2.size();
	        System.out.println(a);
	        l2.get(1).click();
		// l2.get(1).click();
		
		 
		 driver.quit();
	
		 
		
	}

}
