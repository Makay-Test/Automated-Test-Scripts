package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_19 extends Functions {

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Proceed to Products Section.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/brand_products/Kookie Kids']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		// Close browser
		driver.close();
	}
}
