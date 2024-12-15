package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_20 extends Functions {

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Proceed to Products.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Search products.
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Tops");
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();

		// Adding items to the cart.
		Actions action = new Actions(driver);
		
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/12']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='12']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/24']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='24']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/42']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='42']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		// Proceeds to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Sign up new user
		driver.findElement(By.xpath("//li//a[@href='/login']")).click();
		Functions.userSignUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Proceeds back to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Close browser
		driver.close();
	}
}
