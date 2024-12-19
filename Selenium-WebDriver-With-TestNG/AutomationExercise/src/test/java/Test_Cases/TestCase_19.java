package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class TestCase_19 extends Functions {
	
//	Test Case # View & Cart Brand Products
//		Test Steps: 
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Click on 'Products' button
//		4. Verify that Brands are visible on left side bar
//		5. Click on any brand name
//		6. Verify that user is navigated to brand page and brand products are displayed
//		7. On left side bar, click on any other brand link
//		8. Verify that user is navigated to that brand page and can see products
	
	// #########################################################################################################################
	// ####### Please take note that some of the validations are inside of the functions/methods. 
	// #########################################################################################################################

	// ###############
	// ### START #####
	// ###############
	
	@AfterTest
	public void endTest(){
		// Goes to Home page and close the browser
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
		// Close browser
		driver.close();}
	@Test(priority=1)
	public static void View_Cart_Brand_Products() {
		
		// Launch Browser.
		Functions.openBrowser();

		// Proceed to Products Section.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		// VALIDATION POINT:
		//			Verifies that categories are visible on left side bar
		validator.expectedElement("//h2[text()='Brands']",true);
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that user is navigated to brand page and brand products are displayed.
		validator.expectedElement("//h2[text()='Brand - Babyhug Products']",true);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Kookie Kids']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that user is navigated to that brand page and can see products
		validator.expectedElement("//h2[text()='Brand - Kookie Kids Products']",true);

		// Close browser
		//driver.close();
	}
}
