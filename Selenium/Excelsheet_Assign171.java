package selpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet_Assign171 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream file = new FileInputStream("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\EXCEL\\Data.xlsx");
		Workbook w = WorkbookFactory.create(file);
		Sheet sheet = w.getSheet("logindetails");
		Row r1 = sheet.getRow(1);
		Cell c1 = r1.getCell(0);
		String Username = c1.getStringCellValue();
		System.out.println(Username);
		String Password = w.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Password);
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("9890798566");
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		Thread.sleep(4000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Password);

		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();

	}

}
