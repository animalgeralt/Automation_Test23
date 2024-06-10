//package hut;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//import dev.failsafe.internal.util.Assert;
//public class ValidatingallFields {
//
//	WebDriver driver;
//	@BeforeTest
//	 public void setup()
//	 {
//		 driver = new ChromeDriver();
//		 driver.get("https://www.facebook.com");
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	 }
//	@Test(priority=2)
//	public void titleTest() {
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Facebook – log in or sign up", "title is not matched" );
//	}
//	@Test(priority=3)
//	public void EmailTest() {
//		boolean flagE=driver.findElement(By.id("email")).isDisplayed();
//	//	Assert.assertEquals(flag, false, "Image is present");
//		Assert.assertEquals(flagE, true, "Button is present");
//	}
//	@Test(priority=1)
//	public void urlTest() {
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(url, "www.facebook.com", "url does not match");
//	}
//	@Test(priority = 4)
//	public void PasTest() {
//		boolean flagP=driver.findElement(By.id("passContainer")).isDisplayed();
//		Assert.assertEquals(flagP, true, "Password Button is present");
// 
//	}
//	@Test(priority=5)
//	public void LoginButTest() {
//		boolean loginButt= driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
//		Assert.assertEquals(loginButt, true, "LoginButton is present");
// 
//	}
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	 
//	
//	
//	
//		
//	 
//		
//
//	}
//}
