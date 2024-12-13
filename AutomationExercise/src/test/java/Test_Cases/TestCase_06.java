package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_06 {

	public static void main(String[] args) {

//	TestCase #06 - Contact Us Form
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Contact Us' button
//		5. Verify 'GET IN TOUCH' is visible
//		6. Enter name, email, subject and message
//		7. Upload file
//		8. Click 'Submit' button
//		9. Click OK button
//		10. Verify success message 'Success! Your details have been submitted successfully.' is visible
//		11. Click 'Home' button and verify that landed to home page successfully

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String pathHolder = System.getProperty("user.dir");

		// Launch Browser
		driver.get("https://www.automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on Contact Us
		driver.findElement(By.xpath("// a[text()=' Contact us']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Fill up the Information Form
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[1]/input")).sendKeys("Testname");
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[2]/input"))
				.sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[3]/input"))
				.sendKeys("Test Contact button");
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[4]/textarea"))
				.sendKeys("I am writing this text for testing purposes.");
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[5]/input"))
				.sendKeys(pathHolder + "\\src\\test\\resources\\Test_file.txt");
		driver.findElement(By.xpath("//form[@id='contact-us-form']//child::div[6]/input")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//a[@class]")).click();

		// Close browser.
		driver.close();

	}

}
