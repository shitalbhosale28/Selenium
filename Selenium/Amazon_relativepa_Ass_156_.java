package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_relativepa_Ass_156_ {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 search.sendKeys("cloth");
		 search.sendKeys(Keys.ENTER);
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dcloth%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email= driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("abc@hotmail.com");
		WebElement el= driver.findElement(By.xpath("//input[@id='continue']"));
		el.click();
		WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("1234");
		
		WebElement passsignin= driver.findElement(By.xpath("	//input[@class='a-button-input']"));
		passsignin.click();
		
	
		
	}

}
