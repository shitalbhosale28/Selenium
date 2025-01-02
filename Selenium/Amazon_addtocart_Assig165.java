package selpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_addtocart_Assig165 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes" + Keys.ENTER);
		WebElement shoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		shoe.click();
		Thread.sleep(5000);
		Set<String> pcid = driver.getWindowHandles();
		Iterator i1 = pcid.iterator();
		String parent = (String) i1.next();
		String child = (String) i1.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		Thread.sleep(5000);
		WebElement el = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Thread.sleep(2000);
		el.click();
		WebElement cart = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		cart.click();
		Thread.sleep(2000);
	WebElement email=	driver.findElement(By.id("ap_email"));
	email.sendKeys("9890311059");
	 WebElement cont=driver.findElement(By.id("continue"));
	 cont.click();
	  WebElement pass=driver.findElement(By.id("ap_password"));
	  pass.sendKeys("Anshika@2505");
	WebElement signbutton=  driver.findElement(By.id("auth-signin-button"));
	signbutton.click();
	
	email.sendKeys("9890311059");
		//driver.close();

	}

}
