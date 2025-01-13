package TestngAssignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign_179_Dataprov_Integra_Excel {
	@DataProvider(name="usernamepass")
	public Object[][]userpassfromexcel() throws EncryptedDocumentException, IOException{
		FileInputStream f1 =new FileInputStream("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\EXCEL\\Data.xlsx");//java needs to know the location of the file 
		 Workbook w1=WorkbookFactory.create(f1);//open the excel/workbook  sheet .workfactory is a classm
		 Sheet s1 =w1.getSheet("logindetails");//exact sheet we needs to open
		 Row r1= s1.getRow(0);//we will get the row.if we print row directly getting an error likr print r1
		 //System.out.println(r1);
		 Cell c1 = r1.getCell(0);//here we get exact cell like row plus column
		 String user1= c1.getStringCellValue();//getting values in the cell
		 String pass1 =w1.getSheet("logindetails").getRow(0).getCell(1).getStringCellValue();
		 Row r2= s1.getRow(1);//we will get the row.if we print row directly getting an error likr print r1
		Cell c2 = r2.getCell(0);//here we get exact cell like row plus column
		  String user2=c2.getStringCellValue();
		  String pass2 =w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		  ///
		  Row r3= s1.getRow(2);//we will get the row.if we print row directly getting an error likr print r1
			Cell c3 = r3.getCell(0);//here we get exact cell like row plus column
			  String user3= NumberToTextConverter.toText(c3.getNumericCellValue());
			  String pass3 =w1.getSheet("logindetails").getRow(3).getCell(1).getStringCellValue();
		Object[][] d=new Object[3][2];
		//username1and passsword
				d[0][0]=user1;
		d[0][1]=pass1;
		//username2and passsword
		d[1][0]=user2;
			d[1][1]=pass2;
				//usernamepassword3
					d[2][0]=user3;
						d[2][1]=pass3;
				return d;
	}
	@Test(dataProvider="usernamepass")
	public void fetchexcel( String Usernmae,String password) throws EncryptedDocumentException, IOException, InterruptedException {
	
	 
	 //System.out.println(username);
	 //String Password=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();//if data is alphanumeric 
	
	 //System.out.println(Password);
	//System.out.println(pass);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	 WebElement email=driver.findElement(By.id("ap_email"));
	 email.sendKeys(Usernmae);
	 Thread.sleep(2000);
	 WebElement continuebuttn= driver.findElement(By.id("continue"));
	 //driver.quit();
	 continuebuttn.click();
	 Thread.sleep(8000);
	// driver.switchTo().alert().accept();
WebElement pass=	 driver.findElement(By.id("ap_password"));
Thread.sleep(2000);
pass.sendKeys(password);

WebElement signin=driver.findElement(By.id("signInSubmit"));
signin.click();
}
}
