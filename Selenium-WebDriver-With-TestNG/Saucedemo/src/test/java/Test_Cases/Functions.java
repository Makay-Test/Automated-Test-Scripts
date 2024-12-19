package Test_Cases;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {

	public static ChromeDriver driver = new ChromeDriver();

	// Method for launching browser
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
	}

	// Method for Login
	public static void Login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	// Method for placing Personal info.
	public static void Personal_info() {
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345");
	}
}
