package hut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of file
		File src1= new File("C:\\Users\\Ritik\\eclipse-workspace\\hut\\Repository\\config.properties");
		File src2= new File("C:\\Users\\Ritik\\eclipse-workspace\\hut\\Repository\\locators.properties");
		File src3= new File("C:\\Users\\Ritik\\eclipse-workspace\\hut\\Repository\\testdata.properties");
		
		//FileInputStream class loads the file
		FileInputStream config1 = new FileInputStream(src1);
		FileInputStream locator1 = new FileInputStream(src2);
		FileInputStream testdata1 = new FileInputStream(src3);
		
		//Properties class reads the properties file
		
		Properties config2 = new Properties();
		config2.load(config1);
		Properties locator2 = new Properties();
		locator2.load(locator1);
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		WebDriver driver =new ChromeDriver();
		long waitingtime=Long.parseLong(config2.getProperty("Wait", "10"));//setting wait using properties file
		driver.get(config2.getProperty("URL"));
		if(config2.getProperty("Maximize", "false").equalsIgnoreCase("true"))
		{
			driver.manage().window().maximize();
		}
		driver.findElement(By.xpath(locator2.getProperty("Email"))).sendKeys(testdata2.getProperty("TestDataEmail"));
		driver.findElement(By.xpath(locator2.getProperty("Password"))).sendKeys(testdata2.getProperty("TestDataPassword"));
		driver.close();
	}
	
}
