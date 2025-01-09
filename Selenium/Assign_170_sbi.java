package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_170_sbi {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	WebElement loginbutton=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	loginbutton.click();
	driver.findElement(By.id("username")).sendKeys("shital");
	driver.findElement(By.id("label2")).sendKeys("test123");
	driver.findElement(By.id("Button2")).click();

	}

}
