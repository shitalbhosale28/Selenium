package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_autsuggest_ass161 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/blogs/");
		driver.manage().window().maximize();
	WebElement el=	driver.findElement(By.xpath("//input[@class='orig']"));

	el.sendKeys("selenium");
	Thread.sleep(8000);
	
	List<WebElement>sel= driver.findElements(By.xpath("(//div[@class='results'])[2]/div/div"));
	
	System.out.println(sel.size());
	sel.get(2).click();
	Thread.sleep(3000);
	driver.quit();

	}

}
