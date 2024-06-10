package hut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverandclickbymouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.flipkart.com");
		WebElement Electronics= driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		WebElement HomeAndFurniture=driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
		Actions act=new Actions(driver);
        
	}

}
