package hut;


import org.testng.annotations.*;

public class TestClass {
	@Test
 public  void test()
 {
	 System.out.println("Hello");
 }
	@Test
	public  void test2()
	 {
		 System.out.println("Hello test2");
	 }	
	@BeforeTest
	 public  void testbefore()
	 {
		 System.out.println("Before Test");
	 }
	@AfterTest
	 public  void testafter()
	 {
		 System.out.println("After Test");
	 }
	@BeforeMethod
	 public  void BeforeMethod()
	 {
		 System.out.println("Before Method");
	 }
	@AfterMethod
	 public  void AfterMethod()
	 {
		 System.out.println("After Method");
	 }
	@BeforeClass
	 public  void BeforeClasse()
	 {
		 System.out.println("Before Class");
	 }
	@AfterClass
	 public  void AfterClass()
	 {
		 System.out.println("After Class");
	 }
	@BeforeSuite
	 public  void BeforeSuite()
	 {
		 System.out.println("Before Suite");
	 }
	@AfterSuite
	 public  void AfterSuite()
	 {
		 System.out.println("After Suite");
	 }
}
