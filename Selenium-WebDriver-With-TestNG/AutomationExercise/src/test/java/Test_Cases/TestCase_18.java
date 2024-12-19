package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class TestCase_18 extends Functions{

//	Test Case #  View Category Products
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that categories are visible on left side bar
//		4. Click on 'Women' category
//		5. Click on any category link under 'Women' category, for example: Dress
//		6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
//		7. On left side bar, click on any sub-category link of 'Men' category
//		8. Verify that user is navigated to that category page

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
	
	@Test(priority = 1)
	public static void  View_Category_Products() {
		
		// Launch Browser.
		Functions.openBrowser();
		
		// VALIDATION POINT:
		//			Verifies that categories are visible on left side bar
		validator.expectedElement("//h2[text()='Category']",true);
		
		// Clicks on Women Category 
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that category page is displayed and confirm text 'WOMEN - TOPS DRESS'
		validator.expectedElement("//h2[text()='Women - Dress Products']",true);
		
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/6']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that category page is displayed and confirm text 'Men - Jeans'
		validator.expectedElement("//h2[text()='Men - Jeans Products']",true);
		
		// Close browser
		driver.close();
	}
}
