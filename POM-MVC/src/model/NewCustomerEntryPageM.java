package model;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import View.NewCustomerEntryPage;

public class NewCustomerEntryPageM extends NewCustomerEntryPage{
WebDriver driver;
	
	public NewCustomerEntryPageM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickChangePassword() {
		Actions act = new Actions(driver); 
		WebElement menu = driver.findElement(divMenu);
		act.moveToElement(menu).build().perform();
		driver.findElement(changePasswordLink).click();
	}
	
	public void setOldPassword(String oldPass) {
		driver.findElement(oldPassword).sendKeys(oldPass);	
	}
	
	public void setNewPassword(String newPass) {
		driver.findElement(newPassword).sendKeys(newPass);	
	}
	
	public void setCofirmPassword(String conPass) {
		driver.findElement(confirmPassword).sendKeys(conPass);
	}
	
	public void clickSumit() {
		driver.findElement(submitButton).click();
	}
	
	public String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		this.clickChangePassword();
		this.setOldPassword(oldPassword);
		this.setNewPassword(newPassword);
		this.setCofirmPassword(newPassword);
		this.clickSumit();
		Assert.assertEquals(this.getTextAlert(), "Password is Changed");
		this.alertAccept();
	}
}
