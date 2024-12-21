package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_ass151 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
				WebElement e1=	driver.findElement(By.id("container-6"));
				WebElement e2=	driver.findElement(By.id("div2"));
				
				Actions a1=new Actions(driver);
				a1.dragAndDrop(e1, e2).perform();
				Thread.sleep(2000);
				 WebElement button=driver.findElement(By.partialLinkText("Login"));
				 a1.contextClick(button).perform();
				
				
				
				

				
				
				
	}

}
