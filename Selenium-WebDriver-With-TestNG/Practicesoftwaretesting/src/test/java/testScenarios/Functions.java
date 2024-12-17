package testScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {

	// Initialize ChromeDriver lib.
	static ChromeDriver driver = new ChromeDriver();

	// Method for launching browser
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// Method for Login
	public static void login() {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test1122@yopmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testpass");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
