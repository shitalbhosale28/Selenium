package selpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_Assig172 {

	public static void main(String[] args) throws Exception, IOException {

FileInputStream f1 =new FileInputStream("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\EXCEL\\Data.xlsx");//java needs to know the location of the file 
 Workbook w1=WorkbookFactory.create(f1);//open the excel/workbook  sheet .workfactory is a classm
 Sheet s1 =w1.getSheet("logindetails");//exact sheet we needs to open
 Row r1= s1.getRow(1);//we will get the row.if we print row directly getting an error likr print r1
 //System.out.println(r1);
 Cell c1 = r1.getCell(0);//here we get exact cell like row plus column
 String username= c1.getStringCellValue();//getting values in the cell
 System.out.println(username);
 //String Password=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();//if data is alphanumeric 
String pass =NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(1).getCell(1).getNumericCellValue());
 //System.out.println(Password);
System.out.println(pass);
	}

}
