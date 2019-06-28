package connect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connect {
	public static WebDriver driver;

	public void connect() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\download\\selenium\\chromedriver_win32\\chromedriver74.exe");
		driver = new ChromeDriver();
		String url = "http://demo.guru99.com/V4/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	public void quit() {
		driver.quit();
	}
}
