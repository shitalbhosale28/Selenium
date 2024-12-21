package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_grotec_ass145{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		 WebElement search=driver.findElement(By.name("search_query"));
		 search.sendKeys("growtechminds" +Keys.ENTER);
		 
		

	}

}
