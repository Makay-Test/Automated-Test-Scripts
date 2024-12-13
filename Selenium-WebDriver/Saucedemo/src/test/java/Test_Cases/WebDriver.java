package Test_Cases;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
	public static ChromeDriver driver = new ChromeDriver();
	public static ChromeDriver getdriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			return driver;
		} else {
			return driver;
		}
	}
}