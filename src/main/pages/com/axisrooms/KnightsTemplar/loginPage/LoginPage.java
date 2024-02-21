package com.axisrooms.KnightsTemplar.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public final class LoginPage {

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailTextField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'password?')]")
	private WebElement forgotPassword;

	public LoginPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public LoginPage getEmailTextField(String userName) {
		ExplicitWaitFactory.sendKeys(emailTextField, userName, WaitStrategy.PRESENCE,
				" user enter user name in email text field");
		return this;
	}

	public LoginPage getPasswordTextField(String enterPassword) {
		ExplicitWaitFactory.sendKeys(passwordTextField, enterPassword, WaitStrategy.PRESENCE,
				" user enter password in password text field");

		return this;
	}

	public LoginPage getLoginButton() {
		ExplicitWaitFactory.click(loginButton, WaitStrategy.CLICKABLE, "user clicked on the login button");
		return this;
	}

	public WebElement getForgotPassword() {
		ExplicitWaitFactory.click(forgotPassword, WaitStrategy.CLICKABLE, " user clicked on forgot password button");
		return forgotPassword;
	}

}
