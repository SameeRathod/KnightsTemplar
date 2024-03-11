package com.axisrooms.KnightsTemplar.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class ProfilePage {
	
	@FindBy(xpath = "//input[@data-ng-model='user_details.user_name']")
	private WebElement nameTextField;
	
	@FindBy(xpath = "//input[@class='form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement oldPasswordTextField;
	
	@FindBy(xpath = "//input[@data-ng-model='Password.newPassword']")
	private WebElement newPasswordTextField;
	
	@FindBy(xpath = "//input[@data-ng-model='Password.confirmNewPassword']")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//button[normalize-space()='Update Profile']")
	private WebElement updateButton;
	
	public ProfilePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public ProfilePage getNameTextField(String enterName) {
		ExplicitWaitFactory.sendKeys(nameTextField, enterName, WaitStrategy.PRESENCE, " uesr enter name in name text field as "+enterName);
		return this;
	}

	public ProfilePage getOldPasswordTextField(String oldPassword) {
		ExplicitWaitFactory.sendKeys(oldPasswordTextField, oldPassword, WaitStrategy.PRESENCE, " uesr enter old password in old password text field as "+oldPassword);

		return this;
	}

	public ProfilePage getNewPasswordTextField(String enterNewPassword) {
		ExplicitWaitFactory.sendKeys(newPasswordTextField, enterNewPassword, WaitStrategy.PRESENCE, " uesr enter new password in new password text field as "+enterNewPassword);

		return this;
	}

	public ProfilePage getConfirmPasswordTextField(String confirmNewPAssword) {
		ExplicitWaitFactory.sendKeys(confirmPasswordTextField, confirmNewPAssword, WaitStrategy.PRESENCE, " uesr enter confirm  password in confirm password text field as "+confirmNewPAssword);

		return this;
	}

	public WebElement getUpdateButton() {
		ExplicitWaitFactory.click(updateButton, WaitStrategy.CLICKABLE, " user clicked on the update button ");
		return updateButton;
	}
	
	

}
