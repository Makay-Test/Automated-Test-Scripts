package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_09 extends Functions{
	
//	Test Case #09 - Search Product
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Products' button
//		5. Verify user is navigated to ALL PRODUCTS page successfully
//		6. Enter product name in search input and click search button
//		7. Verify 'SEARCHED PRODUCTS' is visible
//		8. Verify all the products related to search are visible

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@Test(priority=1)
	public static void Search_Product() {
		
		// Launch Browser.
		Functions.openBrowser();
		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
//		VALIDATION POINT:
//						Verifies user is navigated to ALL PRODUCTS page successfully
		validator.expectedElement("//h2[text()='All Products']");

		// Input keywords to search.
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Tshirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("submit_search")).click();
		
		String allSearchedProducts [] = {
				"//div[@class='productinfo text-center']//child::p[text()='Men Tshirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton V-Neck T-Shirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Green Side Placket Detail T-Shirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Premium Polo T-Shirts']",
				"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton Neon Green Tshirt']",
				"//div[@class='productinfo text-center']//child::p[text()='GRAPHIC DESIGN MEN T SHIRT - BLUE']"};
		
		for (int i = 0; i < 6; i++) {
		
//		VALIDATION POINT:
//						Verifies user is able to see items related to searched item.
		validator.expectedElement(allSearchedProducts[i]);}
		
		// Close browser.
		driver.close();

	}

}
