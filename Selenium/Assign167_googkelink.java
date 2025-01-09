package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign167_googkelink{

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		for(int i=0;i<alllinks.size();i++)
		{
	 WebElement el=	alllinks.get(i);
 String url=el.getAttribute("href");
  String text=el.getText();
  System.out.println(url);
  System.out.println(text);
	}

}
}
