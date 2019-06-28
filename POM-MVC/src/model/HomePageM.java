package model;
import View.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageM extends View.HomePage{
	WebDriver driver;
	
	public HomePageM(WebDriver driver) {
		this.driver = driver;
	}
	public void setUserID(String user) {
		 driver.findElement(UserID).sendKeys(user);
	}
	
	public void setPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	
	public String getTextLoginSuccessfully() {
		return driver.findElement(textLoginSuccessfully).getText();
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void clickReset() {
		driver.findElement(resetButton).click();
	}
	
	public void Login(String username, String password) {
		this.setUserID(username);
		this.setPassword(password);
		this.clickLogin();
		Assert.assertEquals(this.getTextLoginSuccessfully(), "Manger Id : mngr201222");
	}
	
	public String getUserID() {
		return driver.findElement(UserID).getText();
	}
	
	public String getPassword() {
		return driver.findElement(Password).getText();
	}
	
	public void reset(String username, String password) {
		this.setUserID(username);
		this.setPassword(password);
		this.clickReset();
		Assert.assertEquals(this.getUserID(), "");
		Assert.assertEquals(this.getPassword(), "");
	}
	
	
}

