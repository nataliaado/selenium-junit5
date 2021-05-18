package project.junit5.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import project.junit5.actions.GoogleActions;

class TestGoogle {

	static WebDriver driver;
	static GoogleActions actGoogle;

	@BeforeAll
	static void initTests() {
		System.out.println("Before All tests initiated");
	}

	@BeforeEach
	void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliaado\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		// Actions Instances
		actGoogle = new GoogleActions(driver);
	}

	@ParameterizedTest
	@ValueSource(strings = { "cucumber", "selenium" })
	@Tag("search")
	void searchTermGoogle(String term) throws Exception {
		actGoogle.searchTerm(term);
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
