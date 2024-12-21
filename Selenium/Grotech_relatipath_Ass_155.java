package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Grotech_relatipath_Ass_155 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amolb/Desktop/grotechminds.html");
		WebElement username=driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("shital");
		WebElement hint =driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("hintshital");
		WebElement pass=driver.findElement(By.xpath("(//input)[3]"));
		pass.sendKeys("12345");
		WebElement firtname=driver.findElement(By.xpath("(//input)[4]"));
		firtname.sendKeys("shital");
	/*	WebElement submit=driver.findElement(By.xpath("(//input)[6]"));
		submit.click(); */
		WebElement boy=driver.findElement(By.xpath("(//input)[7]"));
		boy.click();
		WebElement girl=driver.findElement(By.xpath("(//input)[8]"));
		girl.click();
		WebElement baby=driver.findElement(By.xpath("(//input)[9]"));
		baby.click();
		/*WebElement submit1=driver.findElement(By.xpath("(//input)[10]"));
		submit1.click();*/
		WebElement male=driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement female=driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement banglore=driver.findElement(By.xpath("(//input)[13]"));
		banglore.click();
		/*WebElement link=driver.findElement(By.xpath("(//a)[1]"));
		link.click();*/
		WebElement selctop=driver.findElement(By.xpath("(//select)[1]"));
		selctop.click();
		
		
		
	}

}
