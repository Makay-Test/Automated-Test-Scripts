package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_12 {

	public static void main(String[] args) {

//	Test Case #12 - Add Products in Cart
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'Products' button
//		5. Hover over first product and click 'Add to cart'
//		6. Click 'Continue Shopping' button
//		7. Hover over second product and click 'Add to cart'
//		8. Click 'View Cart' button
//		9. Verify both products are added to Cart
//		10. Verify their prices, quantity and total price

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser.
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();

		// Hover to first item
		Actions action = new Actions(driver);
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();

		// Add the product.
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()]")).click();

		// Hover to second item
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/1']"));
		action.moveToElement(productLocator).perform();

		// Add the product.
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()]")).click();
		
		// Check the cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close browser.
		driver.close();
		
	}

}
