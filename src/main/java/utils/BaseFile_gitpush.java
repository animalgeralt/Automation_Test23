package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseFile_gitpush {
	protected WebDriver driver;
	 @BeforeMethod
	 public void browserlaunch()
	 {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com");
	 }
	 
	 @AfterMethod
	 public void browserclose()
	 {
		 if(driver!=null)
		 {
			 driver.quit();
		 }
	 }	
}
