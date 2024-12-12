package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_05_Checkout {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Login
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id='login-button']")).click();

		// Adding Items in the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
		
		//Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		
		
		//Personal Details
		//*[@id='first-name']
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
		driver.close();
	}

}