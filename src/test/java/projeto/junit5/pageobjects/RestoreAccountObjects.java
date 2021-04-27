package projeto.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestoreAccountObjects {

	private WebDriver driver;

	@FindBy(id = "identify_email")
	private WebElement inputRestoreEmail;

	@FindBy(id = "did_submit")
	private WebElement btnSearch;

	public RestoreAccountObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public WebElement getInputRestoreEmail() {
		return inputRestoreEmail;
	}

	public void setInputRecoverEmail(WebElement inputRestoreEmail) {
		this.inputRestoreEmail = inputRestoreEmail;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

}
