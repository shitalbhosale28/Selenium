package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Seachmobil_As146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys("mobiles");
	searchbox.sendKeys(Keys.ENTER);
	}

}
