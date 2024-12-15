package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_09 extends Functions{

	public static void main(String[] args) {

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

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();
		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();

		// Input keywords to search.
		driver.findElement(By.xpath("/input[@id='search_product']")).sendKeys("Tshirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Close browser.
		driver.close();

	}

}
