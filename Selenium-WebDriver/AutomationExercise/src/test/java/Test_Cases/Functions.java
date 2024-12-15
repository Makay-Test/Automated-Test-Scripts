package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {

	// Initialize Webdriver
	static ChromeDriver driver = new ChromeDriver();

	// Launch Browser.
	static void openBrowser() {
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// Login
	static void Login() {
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//form[@action='/login']//child::input[2]")).sendKeys("Testacc123@yopmail.com");
		driver.findElement(By.xpath("//form[@action='/login']//child::input[3]")).sendKeys("Testpass");
		driver.findElement(By.xpath("//form[@action='/login']//child::button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// User Sign up functionality
	public static void userSignUp() {
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testname");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Testacc124@yopmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		// Filling up personal information form
		String InputClickXpathHolder[] = { "//input[@id='id_gender1']", "//option[text()='28']",
				"//option[text()='November']", "//option[text()='1950']", "//input[@id='newsletter']",
				"//input[@id='optin']", "//option[@value='Canada']" };
		String InputTypeXpathHolder[] = { "//input[@id='password']", "//input[@id='first_name']",
				"//input[@id='last_name']", "//input[@id='company']", "//input[@id='address1']", "//input[@id='state']",
				"//input[@id='city']", "//input[@id='zipcode']", "//input[@id='mobile_number']", };
		
		// Input Data
		String InputTypeValueHolder[] = { "Testpass", "TestName", "LastTest", "TestCompany", "Blk 01 Lot 02 Test 03 Dr",
				"Alberta", "Red Deer", "112233", "2104104433" };

		for (int a = 0; a < 7; a++) {
			driver.findElement(By.xpath(InputClickXpathHolder[a])).click();
		}
		for (int b = 0; b < 9; b++) {
			driver.findElement(By.xpath(InputTypeXpathHolder[b])).sendKeys(InputTypeValueHolder[b]);
		}
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	// Checkout
	static void checkOut() {
		driver.findElement(By.xpath("//div[@class='col-sm-6']//child::a")).click();
		driver.findElement(By.xpath("//textarea")).sendKeys("This is a test.");
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Card details
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Test Card");
		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("1122334455");
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2030");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
}
