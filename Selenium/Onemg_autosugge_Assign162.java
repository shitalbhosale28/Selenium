package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onemg_autosugge_Assign162 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.1mg.com/?wpsrc=Google+Organic+Search");
		driver.manage().window().maximize();
		 WebElement search=driver.findElement(By.xpath("//input[@id='srchBarShwInfo']"));
		 search.sendKeys("dolo");
		 Thread.sleep(5000);
		List<WebElement> el=driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		System.out.println(el.size());
		Thread.sleep(2000);
		el.get(el.size()-7).click();
		driver.close();
	
		 
		 
	}

}
