package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_relativ_ass_158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
 WebElement goog=driver.findElement(By.xpath("//textarea[@name='q']"));
 goog.sendKeys("mobile" +Keys.ENTER);
 ////textarea[@name='q']
 //(//textarea)[1]"
 


	}

}
