package project.junit5.actions;

import org.openqa.selenium.WebDriver;

import project.junit5.pageobjects.GoogleObjects;

public class GoogleActions {

	static GoogleObjects objGoogle;

	public GoogleActions(WebDriver driver) {
		objGoogle = new GoogleObjects(driver);
	}

	public void searchTerm(String term) {
		objGoogle.getInputSearch().sendKeys(term);
	}

}
