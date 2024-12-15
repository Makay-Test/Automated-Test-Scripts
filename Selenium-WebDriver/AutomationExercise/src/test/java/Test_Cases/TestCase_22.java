package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_22 extends Functions {

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Scroll to bottom of page
//		4. Verify 'RECOMMENDED ITEMS' are visible
//		5. Click on 'Add To Cart' on Recommended product
//		6. Click on 'View Cart' button
//		7. Verify that product is displayed in cart page

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Scroll down
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,7500)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='recommended_items']//descendant::a"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		// Scroll up
		exec.executeScript("window.scrollBy(0,-7500)");
		driver.findElement(By.xpath("//li//a[@href='/view_cart']")).click();
		
		// Close browser
		driver.close();
	}
}
