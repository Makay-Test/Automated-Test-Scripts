package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_13 {

	public static void main(String[] args) {

//	Test Case #13 Verify Product quantity in Cart
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'View Product' for any product on home page
//		5. Verify product detail is opened
//		6. Increase quantity to 4
//		7. Click 'Add to cart' button
//		8. Click 'View Cart' button
//		9. Verify that product is displayed in cart page with exact quantity

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser.
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();

		// View the product.
		driver.findElement(By.xpath("//a[@href='/product_details/2']")).click();
		driver.findElement(By.xpath("//input[@id='quantity']")).clear();
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[text()]")).click();

		// Check the cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Close browser.
		driver.close();

	}

}
