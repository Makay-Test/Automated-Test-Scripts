package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_08 extends Functions{
	
//	Test Case #08 - Verify All Products and product detail page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Products' button
//		5. Verify user is navigated to ALL PRODUCTS page successfully
//		6. The products list is visible
//		7. Click on 'View Product' of first product
//		8. User is landed to product detail page
//		9. Verify that detail is visible: product name, category, price, availability, condition, brand.

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@AfterTest
	public void endTest(){
		// Goes to Home page and close the browser
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
		// Close browser
		driver.close();}
	
	@Test(priority=1)
	public static void Verify_All_Products_Details_Page() {

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		// VALIDATION POINT:
		//			Verifies user is navigated to ALL PRODUCTS page successfully
		validator.expectedElement("//h2[text()='All Products']",true);
		
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,1000)");
		
		// VALIDATION POINT:
		//			Verifies that detail is visible: product name, category, price, availability, condition, brand.
		String xpathHolder [] = {
				"//h2[text()='Blue Top']","//p[text()='Category: Women > Tops']","//span[text()='Rs. 500']",
				"//p[text()=' In Stock']","//p[text()=' New']","//p[text()=' Polo']"};
		for (int i = 0; i < 6; i++) {
			validator.expectedElement(xpathHolder[i],true);
		}
		
		// Close browser.
		driver.close();
	}

}
