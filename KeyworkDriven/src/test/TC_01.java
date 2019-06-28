package test;


import java.io.IOException;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywork.KeywordDrivenFramwork;


public class TC_01 {
	public WebDriver driver;
	KeywordDrivenFramwork keywork = new KeywordDrivenFramwork(driver);
	datatestcase.TC_01 data = new datatestcase.TC_01();
	
	@Test(description="login with valid username and password")
	public void TC_01() throws Exception{
		Object[][] m = data.readExcel1();
		int row = m.length;
		int colunm = m[0].length;
		for(int i=0; i<row;i++) {
			String key = m[i][3].toString();
			String location = m[i][4].toString();
			String locator_value = m[i][5].toString();
			String param = m[i][6].toString();
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
			case"Assert":
				keywork.Asserttext(location, locator_value, param);
			}
			
		}
		Xl.generateReport("TC_01.xlsx");
	}
}
