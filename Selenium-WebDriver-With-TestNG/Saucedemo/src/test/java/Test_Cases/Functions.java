package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {

	public static WebDriver driver;

	// Method for launching browser
	public static void browserLaunch() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
	}

	// Method for Login
	public static void Login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	// Method for placing Personal info.
	public static void Personal_info() {		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Last Test name");
		driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("12345");
	}
}
