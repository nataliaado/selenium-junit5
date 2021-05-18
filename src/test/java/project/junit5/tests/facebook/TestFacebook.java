package project.junit5.tests.facebook;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import project.junit5.actions.HomeActions;
import project.junit5.actions.RestorePasswordActions;

class TestFacebook {

	static WebDriver driver;
	static HomeActions actHome;
	static RestorePasswordActions actRestore;

	@BeforeAll
	static void initTests() {
		System.out.println("Before All tests initiated");
	}

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
	@Tag("credentials")
	void logarFacebook() throws Exception {
		actHome.login();
	}

	@Test
	@Tag("credentials")
	void createAccount() throws Exception {
		actHome.createNewAccount();
	}

	@ParameterizedTest
	@ValueSource(strings = { "natalia@email.com", "maria@gmail.com", "joao@email.com.br" })
	@Tag("restore")
	void restoreAccount(String email) throws Exception {
		actHome.linkRestorePassword();
		actRestore.restorePassword(email);
	}

	@AfterEach
	void closeWindow() {
		driver.close();
	}

	@AfterAll
	static void finishTests() {
		System.out.println("The tests have been completed with After All");
	}
}