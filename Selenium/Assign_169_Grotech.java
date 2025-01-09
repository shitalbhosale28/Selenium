package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_169_Grotech {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amolb/Desktop/grotechminds.html");
		 WebElement firstname=driver.findElement(By.name("fname"));
		 WebElement lastname= driver.findElement(By.name("lname"));
		 WebElement boycheckbox= driver.findElement(By.id("123"));
		 if(firstname.isEnabled()&&firstname.isDisplayed()==true)
		 {
			 firstname.sendKeys("shital");
		 }
		 if(lastname.isEnabled()&&lastname.isDisplayed()==true)
		 {
			 lastname.sendKeys("bhosale");
		 }
		 else {
			 System.out.println("lastname is disabaled");
		 }
if(boycheckbox.isSelected()==false)
{
	boycheckbox.click();
	
}

	}

}
