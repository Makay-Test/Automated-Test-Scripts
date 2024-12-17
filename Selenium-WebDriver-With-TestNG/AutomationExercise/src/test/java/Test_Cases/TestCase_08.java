package Test_Cases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_08 extends Functions{

	public static void main(String[] args) {
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
//		9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		
		// Close browser.
		driver.close();
	}

}
