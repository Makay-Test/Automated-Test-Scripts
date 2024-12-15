package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_18 extends Functions{

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that categories are visible on left side bar
//		4. Click on 'Women' category
//		5. Click on any category link under 'Women' category, for example: Dress
//		6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
//		7. On left side bar, click on any sub-category link of 'Men' category
//		8. Verify that user is navigated to that category page

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();
		
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close browser
		driver.close();
	}
}
