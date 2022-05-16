package Pages;

import org.openqa.selenium.By;


import base.Base;

public class EmployeeLoginPage extends Base{
	
	
	By userIdBox = By.name("mailuid");
	By userPasswordBox = By.name("pwd");
	By loginClick= By.name("login-submit");
	By employeeLogin = By.xpath("//h1[text()='Employee Login ']");
	
	public String getEmployeeLoginLabel() {
		return browser.findElement(employeeLogin).getText();
	}
	
	public void enterUserName(String uid) {
		browser.findElement(userIdBox).sendKeys(uid);
	}
	
	public void enterPassword(String pwd) {
		browser.findElement(userPasswordBox).sendKeys(pwd);
	}
	
	public void clickLogin() {
		browser.findElement(loginClick).click();
	}
	
	
	
	
}
