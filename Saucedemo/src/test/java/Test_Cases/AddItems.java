package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddItems {

	public static void main(String[] args) throws InterruptedException{

		// Initialize webdriver and selenium.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Login page
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Select/Add an item.
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

	}
}