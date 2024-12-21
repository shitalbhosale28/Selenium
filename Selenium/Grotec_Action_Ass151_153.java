package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Grotec_Action_Ass151_153 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	 WebElement firtname=driver.findElement(By.id("fname"));
	 firtname.sendKeys("shital");
	 Thread.sleep(2000);
	 Actions a1=new Actions(driver);
	 a1.doubleClick(firtname);
	// a1.sendKeys(Keys.CONTROL +"a");
	WebElement SK=driver.findElement(By.id("Skills"));
	Select s1=new Select(SK);
	s1.selectByIndex(1);
	WebElement count=driver.findElement(By.id("Country"));
	Select s2=new Select(count);
	
	s2.selectByContainsVisibleText("Afganistan ");
	WebElement releign=driver.findElement(By.id("Relegion"));
	
	Select s3=new Select(releign);
s3.selectByValue("Hindu");
}
}
