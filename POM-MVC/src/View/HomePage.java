package View;

import org.openqa.selenium.By;

public class HomePage {
	public By UserID = By.name("uid");// text box UserID 
	public By Password = By.name("password");// text box Password
	public By loginButton = By.name("btnLogin");
	public By resetButton = By.name("btnReset");
	public By textLoginSuccessfully = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
}
