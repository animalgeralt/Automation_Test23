package hut;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingexcel {
	 
	public static void main(String[] args) throws Exception {
		//specifying the location
		File src = new File("C:\\Users\\Ritik\\eclipse-workspace\\hut\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		//load File
		
		FileInputStream workBook = new FileInputStream(src);
		
		//load workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(workBook);
		//load sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(0).getNumericCellValue());
		System.out.println((int)sheet.getRow(3).getCell(0).getNumericCellValue());
		
		
		//Total no of rows
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		String email=sheet.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
 
	}
 
}


