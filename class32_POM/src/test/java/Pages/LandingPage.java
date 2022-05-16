package Pages;

import org.openqa.selenium.By;


import base.Base;

public class LandingPage extends Base {
	
	
	By loginBtn = By.xpath("//a[text()='LOG IN']");
	
	public void navigateURL() {
		browser.get("https://sit.skyschooling.com/microtech");
	}
	public void clickLoginBtn() {
		browser.findElement(loginBtn).click();
	}
}
