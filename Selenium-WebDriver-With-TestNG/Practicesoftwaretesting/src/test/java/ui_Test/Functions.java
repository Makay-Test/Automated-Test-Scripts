package ui_Test;

import java.io.IOException;

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
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
	}

	// Method for Login
	public static void Login() throws IOException {
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		String[] user_data = Data_read.user_accounts(0, 1);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user_data[0]);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(user_data[1]);
		driver.findElement(By.xpath("//input[@class='btnSubmit']")).click();
	}
	
	// Method for placing Personal info.
	public static void Personal_info() {		
	}
}
