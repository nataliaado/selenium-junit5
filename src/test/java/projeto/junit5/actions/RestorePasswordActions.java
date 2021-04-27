package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit5.pageobjects.RestoreAccountObjects;

public class RestorePasswordActions {

	static RestoreAccountObjects objResAccount;

	public RestorePasswordActions(WebDriver driver) {
		objResAccount = new RestoreAccountObjects(driver);
	}

	public static void restorePassword() {
		objResAccount.getInputRestoreEmail().sendKeys("natalia@email.com");
		objResAccount.getBtnSearch().click();
	}

}
