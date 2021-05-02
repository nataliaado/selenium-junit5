package projeto.junit5.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.junit5.actions.HomeActions;
import projeto.junit5.actions.RestorePasswordActions;

class TestFacebook {

	static WebDriver driver;
	static HomeActions actHome;
	static RestorePasswordActions actRestore;

	@BeforeEach
	void openFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliaado\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		// Actions Instances
		actHome = new HomeActions(driver);
		actRestore = new RestorePasswordActions(driver);
	}

	@Test
	void logarFacebook() throws Exception {
		actHome.login();
	}

	@Test
	void createAccount() throws Exception {
		actHome.createNewAccount();
	}

	@Test
	void restorePassword() throws Exception {
		actHome.LinkRestorePassword();
		actRestore.restorePassword();
	}

	@AfterEach
	void closeWindow() {
		driver.close();
	}
}