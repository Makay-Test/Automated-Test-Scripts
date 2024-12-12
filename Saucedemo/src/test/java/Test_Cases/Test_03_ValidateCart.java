package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_03_ValidateCart {

	public static void main(String[] args) {

		// Initialize webdriver and selenium.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Login page
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// Adding Items
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();

		// Removing Items from cart
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

		// Proceeds to select other items
		driver.findElement(By.id("continue-shopping")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
	}
}