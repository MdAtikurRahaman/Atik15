package Pages;

import org.openqa.selenium.By;


import base.Base;

public class HomePage extends Base{


	By welcomeText = By.xpath("//h2[text()='Welcome Test ']");
	
	
	public String getWelcomeText() {
		return browser.findElement(welcomeText).getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
