package project.junit5.actions;

import org.openqa.selenium.WebDriver;

import project.junit5.pageobjects.RestoreAccountObjects;

public class RestorePasswordActions {

	static RestoreAccountObjects objResAccount;

	public RestorePasswordActions(WebDriver driver) {
		objResAccount = new RestoreAccountObjects(driver);
	}

	public void restorePassword(String email) {
		objResAccount.getInputRestoreEmail().sendKeys(email);
		objResAccount.getBtnSearch().click();
	}

}
