package hut;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alerthandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		String altertext= driver.switchTo().alert().getText();
		String exptext= "Press a Button !";
		if(altertext.equals(exptext))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Accepted");
		
	}

}
