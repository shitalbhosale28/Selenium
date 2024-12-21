package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_hovercamera_ass_159 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// WebElement el=driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Actions a1 = new Actions(driver);
		// a1.moveToElement(el).perform();
		// WebElement wom=driver.findElement(By.partialLinkText("Women Ethnic"));
		// a1.moveToElement(wom).perform();
		// wom.click();
		// Thread.sleep(2000);
		WebElement cam = driver.findElement(By.xpath("//span[.='Electronics']"));

		a1.moveToElement(cam).perform();
		// cam.click();
		WebElement cam1 = driver.findElement(By.partialLinkText("Cameras & Accessories"));
		// Thread.sleep(3000);
		a1.moveToElement(cam1).perform();
		WebElement cam2 = driver.findElement(By.partialLinkText("Drone"));
		cam2.click();

		// cam1.click();

	}

}
