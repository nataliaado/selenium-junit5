package projeto.junit5.tests;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestFacebook {

	static WebDriver driver;

	@BeforeEach
	void openFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
	}

}