package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtech_Regist_ass147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		WebElement firsname = driver.findElement(By.id("fname"));
		firsname.sendKeys("shital");
		// WebElement el= driver.findElement(By.id("fname"));
		WebElement lastname = driver.findElement(By.id("lname"));
		lastname.sendKeys("bhosale");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shital@123.com");
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys("12536536");
		WebElement presaddress = driver.findElement(By.id("Present-Address"));
		presaddress.sendKeys("s hjgdjdgfdhgd hjsdghj");
		WebElement permaddress = driver.findElement(By.id("Permanent-Address"));
		permaddress.sendKeys("hdghjsdghjddsdjhgdsh");
		WebElement pincode = driver.findElement(By.name("Pincode"));
		pincode.sendKeys("7687");
		WebElement upfile = driver.findElement(By.name("file"));
		// el11.click();
		upfile.sendKeys("C:\\Users\\amolb\\Desktop\\grotechminds.html");

	}

}
