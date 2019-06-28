package View;

import org.openqa.selenium.By;

public class NewCustomerEntryPage {
	public By divMenu = By.xpath("/html/body/div[3]/div");// div chứa menu
	public By changePasswordLink = By.xpath("/html/body/div[3]/div/ul/li[11]/a");// change password
	public By oldPassword = By.name("oldpassword");// text box old password
	public By newPassword = By.name("newpassword");// text box new password
	public By confirmPassword = By.name("confirmpassword");// text box confirm password
	public By submitButton = By.name("sub");// button submit
	public By resetButton = By.name("res");// button reset
}
