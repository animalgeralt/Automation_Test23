package hut;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Loginfb {

	WebDriver driver;
		
		@BeforeClass
		public void abc()
		{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.facebook.com");
		}
		
		@DataProvider
		public Object[][] dataSet() throws Exception
		{
			File src3= new File("C:\\Users\\Ritik\\eclipse-workspace\\hut\\Repository\\testdata.properties");
			FileInputStream testdata1 = new FileInputStream(src3);
			Properties testdata2 = new Properties();
			testdata2.load(testdata1);
			Object arr[][] = new Object[3][2];
			arr[0][0]=testdata2.getProperty("TestDataEmail");
			arr[0][1]=testdata2.getProperty("TestDataPassword");
			
			arr[1][0]="Username2";
			arr[1][1]="Password2";
			
			arr[2][0]="Username3";
			arr[2][1]="Password3";
			
			return arr;
		}
		
		@Test(dataProvider="dataSet")
		public void logincheck(String username, String password)
		{
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		}
		
		@AfterClass
		
		public void close()
		{

			driver.close();
		}
		
	}



