package hut;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		
		//one way
		
//		WebElement birthmonth = driver.findElement(By.xpath("//select[@id='month']"));
//		Select month=new Select(birthmonth);
//		Thread.sleep(2000);
//		month.selectByVisibleText("Apr");
		
		//Second Way
		
		List<WebElement> drop=driver.findElements(By.xpath("//select[@id='month']//option"));
		String Expect="Dec";
		for(int i=0;i<drop.size();i++)
		{
			if(drop.get(i).getText().equalsIgnoreCase(Expect))
			{
				drop.get(i).click();
			}
		}
		
	  	
	}

}
