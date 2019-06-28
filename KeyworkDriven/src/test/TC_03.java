package test;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import keywork.KeywordDrivenFramwork;

public class TC_03 {
	public WebDriver driver;
	datatestcase.TC_03 data = new datatestcase.TC_03();
	KeywordDrivenFramwork keywork = new KeywordDrivenFramwork(driver);
	
	@Test(description ="change password")
	public void TC_03() throws Exception {
		Object[][] m3 = data.readExcel3();
		int row = m3.length;
		int colunm = m3[0].length;
		for(int i=0; i<row;i++) {
			String key = m3[i][3].toString();
			String location = m3[i][4].toString();
			String locator_value = m3[i][5].toString();
			String param = m3[i][6].toString();
			switch(key) {
			case"Navigate":
				keywork.Navigate(param);
				break;
			case"Enter":
				keywork.Enter(location, locator_value, param);
				break;
			case"Click":
				keywork.Click(location, locator_value);
				break;
			case"Close":
				keywork.Close();
				break;	
			case"Hower":
				keywork.hower(location, locator_value);
			    break;
			case"AlertAccept":
				keywork.alertAccept();
				break;
			case"AlertAssert":
				keywork.AssertAlert(param);
				break;
			}
			
			
		}
		Xl.generateReport("TC_03.xlsx");
	}
}
