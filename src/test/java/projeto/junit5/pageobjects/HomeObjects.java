package projeto.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {

	private WebDriver driver;

	@FindBy(id = "email")
	private WebElement inputEmail;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	@FindBy(partialLinkText = "Esqueceu a senha")
	private WebElement linkForgotAccount;

	@FindBy(xpath = "//a[@data-testid]")
	private WebElement btnNewAccount;

	@FindBy(name = "firstname")
	private WebElement inputName;

	@FindBy(name = "lastname")
	private WebElement inputLastName;

	@FindBy(name = "reg_email__")
	private WebElement inputCellOrEmail;

	@FindBy(name = "reg_passwd__")
	private WebElement inputNewPassword;

	@FindBy(name = "sex")
	private WebElement radioFemale;

	@FindBy(name = "websubmit")
	private WebElement btnSignUp;

	public HomeObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	public WebElement getLinkForgotAccount() {
		return linkForgotAccount;
	}

	public void setLinkForgotAccount(WebElement linkForgotAccount) {
		this.linkForgotAccount = linkForgotAccount;
	}

	public WebElement getBtnNewAccount() {
		return btnNewAccount;
	}

	public void setBtnNewAccount(WebElement btnNewAccount) {
		this.btnNewAccount = btnNewAccount;
	}

	public WebElement getInputName() {
		return inputName;
	}

	public void setInputName(WebElement inputName) {
		this.inputName = inputName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public void setInputLastName(WebElement inputLastName) {
		this.inputLastName = inputLastName;
	}

	public WebElement getInputCellOrEmail() {
		return inputCellOrEmail;
	}

	public void setInputCellOrEmail(WebElement inputCellOrEmail) {
		this.inputCellOrEmail = inputCellOrEmail;
	}

	public WebElement getInputNewPassword() {
		return inputNewPassword;
	}

	public void setInputNewPassword(WebElement inputNewPassword) {
		this.inputNewPassword = inputNewPassword;
	}

	public WebElement getRadioFemale() {
		return radioFemale;
	}

	public void setRadioFemale(WebElement radioFemale) {
		this.radioFemale = radioFemale;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public void setBtnSignUp(WebElement btnSignUp) {
		this.btnSignUp = btnSignUp;
	}

}
