package project.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleObjects {

	private WebDriver driver;

	@FindBy(name = "q")
	private WebElement inputSearch;

	@FindBy(name = "btnK")
	private WebElement btnSearch;

	public GoogleObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public WebElement getInputSearch() {
		return inputSearch;
	}

	public void setInputSearch(WebElement inputSearch) {
		this.inputSearch = inputSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

}
