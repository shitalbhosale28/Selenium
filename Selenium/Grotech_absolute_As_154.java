package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  Grotech_absolute_As_154{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amolb/Desktop/grotechminds.html");
		 WebElement el=driver.findElement(By.xpath("(/html/body/input)[1]"));
		 el.sendKeys("shital");
		 WebElement el1= driver.findElement(By.xpath("(/html/body/input)[2]"));
		 el1.sendKeys("hinttest");
		 WebElement el2=driver.findElement(By.xpath("(/html/body/input)[3]"));
		 el2.sendKeys("123456");
		 WebElement el3=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		 el3.sendKeys("shitaltest");
		 WebElement el4=driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
		// el4.click();
		 WebElement el5=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		 el5.click();
		 WebElement el6=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		 el6.click();
		 WebElement el7=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		 el7.click();
		 WebElement el8=driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
		 
		//el8.click();
		 WebElement el9=driver.findElement(By.xpath(" (/html/body/input)[4]"));
		 el9.click();
		 WebElement el10=driver.findElement(By.xpath(" (/html/body/input)[5]"));
		 el10.click();
		 
		 WebElement el11=driver.findElement(By.xpath(" (/html/body/input)[6] "));
		 el11.click();

		 WebElement el12=driver.findElement(By.xpath("  (/html/body/select) "));
		 el12.click();
		Select s1=new Select (el12);
		s1.selectByIndex(2);
		WebElement el14=driver.findElement(By.partialLinkText("Click to know about us"));
		el14.click();

		 WebElement el13=driver.findElement(By.xpath("  (/html/body/input)[7] "));
		 el13.click();
		 
		
		 
		
		 
	
		 
		 

		

	}

}
