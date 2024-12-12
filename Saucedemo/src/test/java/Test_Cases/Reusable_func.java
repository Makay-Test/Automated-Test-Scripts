package Test_Cases;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable_func extends WebDriver {

	public void Login() {
		WebDriverManager.chromedriver().setup();
		// Login page
		getdriver().get("https://www.saucedemo.com/");
		getdriver().findElement(By.id("user-name")).sendKeys("standard_user");
		getdriver().findElement(By.id("password")).sendKeys("secret_sauce");
		getdriver().findElement(By.id("login-button")).click();
	}

	public void Personal_info() {
		//Personal info page
		getdriver().findElement(By.xpath("//*[@id='first-name']")).sendKeys("Test");
		getdriver().findElement(By.xpath("//*[@id='last-name']")).sendKeys("Test");
		getdriver().findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345");
	}
}
