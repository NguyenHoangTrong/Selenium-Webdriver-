package keywork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class KeywordDrivenFramwork {
	WebDriver driver;

	public KeywordDrivenFramwork(WebDriver driver) {
		this.driver = driver;
	}

	// truy cập vào trang web bất kì
	public void Navigate(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\download\\selenium\\chromedriver_win32\\chromedriver74.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	// đóng trình duyệt
	public void Close() {
		driver.quit();
	}

	// nhập dữ liệu vào ô text box
	// location là thuộc tính
	// locatorvalue là giá trị thuộc tính
	// param là giá trị truyền vào text box
	public void Enter(String location, String locatorvalue, String param) {
		switch (location) {
		case "xpath":
			driver.findElement(By.xpath(locatorvalue)).sendKeys(param);
			break;
		case "id":
			driver.findElement(By.id(locatorvalue)).sendKeys(param);
			break;
		case "className":
			driver.findElement(By.className(locatorvalue)).sendKeys(param);
			break;
		case "cssSelector":
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(param);
			break;
		case "linkText":
			driver.findElement(By.linkText(locatorvalue)).sendKeys(param);
			break;
		case "name":
			driver.findElement(By.name(locatorvalue)).sendKeys(param);
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorvalue)).sendKeys(param);
			break;
		case "partialLinkText":
			driver.findElement(By.partialLinkText(locatorvalue)).sendKeys(param);
			break;
		}
	}

	// hàm Click chuột
	public void Click(String location, String locatorvalue) throws InterruptedException {
		switch (location) {
		case "xpath":
			driver.findElement(By.xpath(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "id":
			driver.findElement(By.id(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "className":
			driver.findElement(By.className(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "cssSelector":
			driver.findElement(By.cssSelector(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "linkText":
			driver.findElement(By.linkText(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "name":
			driver.findElement(By.name(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		case "partialLinkText":
			driver.findElement(By.partialLinkText(locatorvalue)).click();
			Thread.sleep(5000);
			break;
		}
	}

	// lấy tiêu đề trang web
	public String getTille() {
		return driver.getTitle();
	}

	// lấy URL trang web
	public String getURL() {
		return driver.getCurrentUrl();
	}

	// lấy text của một phần tử HTML
	public String Gettext(String location, String locatorvalue) {
		String text = "";
		switch (location) {
		case "xpath":
			text = driver.findElement(By.xpath(locatorvalue)).getText();
			break;
		case "id":
			text = driver.findElement(By.id(locatorvalue)).getText();
			break;
		case "className":
			text = driver.findElement(By.className(locatorvalue)).getText();
			break;
		case "cssSelector":
			text = driver.findElement(By.cssSelector(locatorvalue)).getText();
			break;
		case "linkText":
			text = driver.findElement(By.linkText(locatorvalue)).getText();
			break;
		case "name":
			text = driver.findElement(By.name(locatorvalue)).getText();
			text += text;
			break;
		case "tagName":
			text = driver.findElement(By.tagName(locatorvalue)).getText();
			break;
		case "partialLinkText":
			text = driver.findElement(By.partialLinkText(locatorvalue)).getText();
			break;
		}
		return text;
	}

	// chọn phần tử của dropDown sử dụng thuộc tính deselectByVisibleText
	public void dropDown(String location, String locatorvalue, String param) {
		switch (location) {
		case "xpath":
			Select slx = new Select(driver.findElement(By.xpath(locatorvalue)));
			slx.deselectByVisibleText(param);
			break;
		case "id":
			Select sli = new Select(driver.findElement(By.id(locatorvalue)));
			sli.deselectByVisibleText(param);
			break;
		case "className":
			Select slc = new Select(driver.findElement(By.className(locatorvalue)));
			slc.deselectByVisibleText(param);
			break;
		case "cssSelector":
			Select slcss = new Select(driver.findElement(By.cssSelector(locatorvalue)));
			slcss.deselectByVisibleText(param);
			break;
		case "linkText":
			Select sll = new Select(driver.findElement(By.linkText(locatorvalue)));
			sll.deselectByVisibleText(param);
			break;
		case "name":
			Select sln = new Select(driver.findElement(By.name(locatorvalue)));
			sln.deselectByVisibleText(param);
			break;
		case "tagName":
			Select slt = new Select(driver.findElement(By.tagName(locatorvalue)));
			slt.deselectByVisibleText(param);
			break;
		case "partialLinkText":
			Select sl = new Select(driver.findElement(By.partialLinkText(locatorvalue)));
			sl.deselectByVisibleText(param);
			break;
		}
	}

	// hower một đối tượng trên trang web
	public void hower(String location, String locatorvalue) {
		switch (location) {
		case "xpath":
			WebElement x = driver.findElement(By.xpath(locatorvalue));
			Actions actx = new Actions(driver);
			actx.moveToElement(x).build().perform();
			break;
		case "id":
			WebElement i = driver.findElement(By.id(locatorvalue));
			Actions acti = new Actions(driver);
			acti.moveToElement(i).build().perform();
			break;
		case "className":
			WebElement c = driver.findElement(By.className(locatorvalue));
			Actions actc = new Actions(driver);
			actc.moveToElement(c).build().perform();
			break;
		case "cssSelector":
			WebElement css = driver.findElement(By.cssSelector(locatorvalue));
			Actions actcss = new Actions(driver);
			actcss.moveToElement(css).build().perform();
			break;
		case "linkText":
			WebElement l = driver.findElement(By.linkText(locatorvalue));
			Actions actl = new Actions(driver);
			actl.moveToElement(l).build().perform();
			break;
		case "name":
			WebElement n = driver.findElement(By.name(locatorvalue));
			Actions actn = new Actions(driver);
			actn.moveToElement(n).build().perform();
			break;
		case "tagName":
			WebElement t = driver.findElement(By.tagName(locatorvalue));
			Actions actt = new Actions(driver);
			actt.moveToElement(t).build().perform();
			break;
		case "partialLinkText":
			WebElement p = driver.findElement(By.partialLinkText(locatorvalue));
			Actions actp = new Actions(driver);
			actp.moveToElement(p).build().perform();
			break;
		}
	}

	// so sánh text lấy được trên trang web với kết quả mong đợi
	public void Asserttext(String location, String locatorvalue, String param) {
		org.testng.Assert.assertEquals(this.Gettext(location, locatorvalue), param);
	}

	// lấy text của alert
	public String alertGetText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	// nhấn nút ok trong alert
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// nhấn nút cancel trong alert
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// so sánh text trong alert với kết quả mong đợi
	public void AssertAlert(String param) {
		Assert.assertEquals(this.alertGetText(), param);
	}

	// nhấn Enter trên bàn phím
	public void pressEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.perform();
	}

	// nhấn Delede trên bàn phím
	public void pressDelete() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DELETE);
		action.perform();
	}

	// nhấn tổ hợp phím Ctrl + a trên bàn phím
	public void ctrlPlushA() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		action.perform();
	}

	// nhấn tổ hợp phím Ctrl + Shift + a trên bàn phím
	public void ctrlShiftDelete() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("s").build().perform();
		action.keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
	}

	// nhấn phím F1 trên bàn phím
	public void pressF1() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F1);
		action.perform();
	}

	// double click vào một phần tử
	public void duobleClick(String location, String locatorvalue) {
		switch (location) {
		case "xpath":
			WebElement x = driver.findElement(By.xpath(locatorvalue));
			Actions actions = new Actions(driver);
			actions.doubleClick(x).perform();
			break;
		case "id":
			WebElement i = driver.findElement(By.id(locatorvalue));
			Actions actions1 = new Actions(driver);
			actions1.doubleClick(i).perform();
			break;
		case "className":
			WebElement c = driver.findElement(By.className(locatorvalue));
			Actions actions2 = new Actions(driver);
			actions2.doubleClick(c).perform();
			break;
		case "cssSelector":
			WebElement css = driver.findElement(By.cssSelector(locatorvalue));
			Actions actions3 = new Actions(driver);
			actions3.doubleClick(css).perform();
			break;
		case "linkText":
			WebElement linkT = driver.findElement(By.linkText(locatorvalue));
			Actions actions4 = new Actions(driver);
			actions4.doubleClick(linkT).perform();
			break;
		case "name":
			WebElement name = driver.findElement(By.name(locatorvalue));
			Actions actions5 = new Actions(driver);
			actions5.doubleClick(name).perform();
			break;
		case "tagName":
			WebElement tag = driver.findElement(By.tagName(locatorvalue));
			Actions actions6 = new Actions(driver);
			actions6.doubleClick(tag).perform();
			break;
		case "partialLinkText":
			WebElement part = driver.findElement(By.partialLinkText(locatorvalue));
			Actions actions7 = new Actions(driver);
			actions7.doubleClick(part).perform();
			break;
		}
	}

	// right click vào một phần tử
	public void rightClick(String location, String locatorvalue) {
		switch (location) {
		case "xpath":
			WebElement x = driver.findElement(By.xpath(locatorvalue));
			Actions actions = new Actions(driver);
			actions.contextClick(x).perform();
			break;
		case "id":
			WebElement i = driver.findElement(By.id(locatorvalue));
			Actions actions1 = new Actions(driver);
			actions1.contextClick(i).perform();
			break;
		case "className":
			WebElement c = driver.findElement(By.className(locatorvalue));
			Actions actions2 = new Actions(driver);
			actions2.contextClick(c).perform();
			break;
		case "cssSelector":
			WebElement css = driver.findElement(By.cssSelector(locatorvalue));
			Actions actions3 = new Actions(driver);
			actions3.contextClick(css).perform();
			break;
		case "linkText":
			WebElement linkT = driver.findElement(By.linkText(locatorvalue));
			Actions actions4 = new Actions(driver);
			actions4.contextClick(linkT).perform();
			break;
		case "name":
			WebElement name = driver.findElement(By.name(locatorvalue));
			Actions actions5 = new Actions(driver);
			actions5.contextClick(name).perform();
			break;
		case "tagName":
			WebElement tag = driver.findElement(By.tagName(locatorvalue));
			Actions actions6 = new Actions(driver);
			actions6.contextClick(tag).perform();
			break;
		case "partialLinkText":
			WebElement part = driver.findElement(By.partialLinkText(locatorvalue));
			Actions actions7 = new Actions(driver);
			actions7.contextClick(part).perform();
			break;
		}
	}
	
	

}
