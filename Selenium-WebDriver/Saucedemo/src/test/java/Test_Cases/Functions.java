package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {
	
	public static ChromeDriver driver = new ChromeDriver(); 
	public static void Login() {
		WebDriverManager.chromedriver().setup();
		
		// Login page
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	public static void Personal_info() {
		// Personal info page
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345");
	}
}
