package control;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import connect.Connect;
import model.HomePageM;

public class TC_01 extends Connect{
	Connect conn = new Connect();
	HomePageM home;
	@BeforeTest
	public void start() throws InterruptedException {
		conn.connect();
	}

	@Test(description= "login successfully with valid UserID and Password")
	public void login() {
		home = new HomePageM(driver);
		home.Login("mngr201222", "20Ae32%220");
	}	

	@AfterTest
	public void close() {
		conn.quit();
	}

}
