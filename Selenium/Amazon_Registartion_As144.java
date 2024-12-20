package selpack;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Amazon_Registartion_As144 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	/*	WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Shital");
		WebElement phone = driver.findElement(By.id("ap_phone_number"));
		phone.sendKeys("9890675434");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("test123");
*/
		WebElement el3 = driver.findElement(By.id("continue"));
		el3.click();
		TakesScreenshot ts=          driver;
		File source=		ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\Screenshots\\twe.png");
		FileHandler.copy(source, destination);
									

	}

}
