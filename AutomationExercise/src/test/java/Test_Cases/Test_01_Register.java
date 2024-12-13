package Test_Cases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_01_Register {

	public static void main(String[] args) {

		String InputClickXpathHolder[] = { "//input[@id='id_gender1']", "//option[text()='28']",
				"//option[text()='November']", "//option[text()='1950']", "//input[@id='newsletter']",
				"//input[@id='optin']", "//option[@value='Canada']" };
		String InputTypeXpathHolder[] = { "//input[@id='password']", "//input[@id='first_name']",
				"//input[@id='last_name']", "//input[@id='company']", "//input[@id='address1']", "//input[@id='state']",
				"//input[@id='city']", "//input[@id='zipcode']", "//input[@id='mobile_number']", };
		String InputTypeValueHolder[] = { "Testpass", "TestName", "LastTest", "TestCompany", "Blk 01 Lot 02 Test 03 Dr",
				"Alberta", "Red Deer", "112233", "2104104433" };

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser
		driver.get("https://www.automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Login
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

		// Register as new user
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testname");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		// Filling up personal information form
		for (int a = 0; a < 7; a++) {
			driver.findElement(By.xpath(InputClickXpathHolder[a])).click();
		}
		for (int b = 0; b < 9; b++) {
			driver.findElement(By.xpath(InputTypeXpathHolder[b])).sendKeys(InputTypeValueHolder[b]);
		}
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).sendKeys("Testname");
	}



}
