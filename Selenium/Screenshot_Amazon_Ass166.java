package selpack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot_Amazon_Ass166 {

	public static void main(String[] args) throws IOException {
		Date d1=new Date();
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS");
		System.out.println(dt1.format(d1));
		if(1<0)
			System.exit(0);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("idcard");
		Screenshot_Amazon_Ass166 obj=new Screenshot_Amazon_Ass166();
		
	
	System.out.println(d1.getTime());

	String humantime=	d1.toString();
	System.out.println(humantime);

	

	String date=humantime.substring(8, 10);
	String month=humantime.substring(4, 7);
	
	String year=humantime.substring(24);

	String time=humantime.substring(11, 19).replace(":", "-");

	String date1=date+month +year+time;
	

	TakesScreenshot ts = driver;
File Source=	 ts.getScreenshotAs(OutputType.FILE);

//	File Destination=new File("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\Screenshot1\\first_" +obj.getClass().getName()+"_"+dt1.format(d1)+".png");
File Destination=new File("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\Screenshot1\\first" +Math.random()+obj.getClass().getName()+date1+".png");
FileHandler.copy(Source, Destination);
driver.quit();

	}

}
