package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit5.pageobjects.HomeObjects;

public class HomeActions {

	static HomeObjects objHome;

	public HomeActions(WebDriver driver) {
		objHome = new HomeObjects(driver);
	}

	public void login() {
		objHome.getInputEmail().sendKeys("natalia@email.com");
		objHome.getInputPassword().sendKeys("123456");
		objHome.getBtnLogin().click();

	}

	public void createNewAccount() {
		objHome.getInputName().sendKeys("Natalia");
		objHome.getInputLastName().sendKeys("Oliveira");
		objHome.getRadioFemale().click();
		objHome.getBtnSignUp().click();
	}

	public void LinkRestorePassword() {
		objHome.getLinkForgotAccount().click();
	}

}
