package control;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import connect.Connect;
import model.HomePageM;

public class TC_02 extends Connect{
	Connect conn = new Connect();
	HomePageM home;
	@BeforeTest
	public void start() throws InterruptedException {
		conn.connect();
	}

	@Test(description= "'UserID' textbox and 'Password' is empty when user click 'reset' button ")
	public void reset() {
		home = new HomePageM(driver);
		home.reset("mngr201222", "20Ae32%220");
	}

	@AfterTest
	public void close() {
		conn.quit();
	}
}
