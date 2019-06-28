package test;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import keywork.KeywordDrivenFramwork;

public class TC_02 {
	public WebDriver driver;
	datatestcase.TC_02 data = new datatestcase.TC_02();
	KeywordDrivenFramwork keywork = new KeywordDrivenFramwork(driver);
	
	@Test(description ="click 'Selenium DatePicker Demo' link when login successfully")
	public void TC_02() throws Exception {
		Object[][] m2 = data.readExcel2();
		int row = m2.length;
		int colunm = m2[0].length;
		for(int i=0; i<row;i++) {
			String key = m2[i][3].toString();
			String location = m2[i][4].toString();
			String locator_value = m2[i][5].toString();
			String param = m2[i][6].toString();
			switch(key) {
			case"Navigate":
				keywork.Navigate(param);
				break;
			case"Enter":
				keywork.Enter(location, locator_value, param);
				break;
			case"Hower":
				keywork.hower(location, locator_value);
			    break;
			case"Click":
				keywork.Click(location, locator_value);
				break;
			case"Close":
				keywork.Close();
				break;	
			case"Asserttext":
				keywork.Asserttext(location, locator_value, param);
			}
			
			
		}
		Xl.generateReport("TC_02.xlsx");
	}
		
	}

