package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_javasc_Ass160 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		 WebElement el=driver.findElement(By.xpath("//button[@class='btnjs']"));
		 el.click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();

	}

}
