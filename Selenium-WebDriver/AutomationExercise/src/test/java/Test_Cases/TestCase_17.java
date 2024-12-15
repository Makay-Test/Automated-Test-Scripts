package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_17 extends Functions{

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Add products to cart
//		5. Click 'Cart' button
//		6. Verify that cart page is displayed
//		7. Click 'X' button corresponding to particular product
//		8. Verify that product is removed from the cart

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();
		
		// Adding products to cart
		// Hover to first item
		Actions action = new Actions(driver);
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/3']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='3']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/4']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='4']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		// Proceeds to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		// Removing Items in the cart.
		driver.findElement(By.xpath("//td[@class='cart_delete']//child::a[@data-product-id='2']")).click();
		driver.findElement(By.xpath("//td[@class='cart_delete']//child::a[@data-product-id='3']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close browser
		driver.close();
	}
}
