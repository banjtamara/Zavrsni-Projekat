package strana.test;

import org.openqa.selenium.WebDriver;

import utils.Excel;
import utils.constant;

public class test {
	public static void fillForm(WebDriver driver,int i) throws Exception {
		Excel.
		setExcelFile
		(constant.PathExcel+constant.FileName,constant.SheetName);
		
		//FirstName
		strana.Registracija.getFirstName(driver);
		
		strana.Registracija.sendKeysFirstName(driver, Excel.getCellData(i, 0));
		
		//LastName
		strana.Registracija.getLastName(driver);
		
		strana.Registracija.sendKeysLastName(driver, Excel.getCellData(i, 1));
		
		//UserName
		strana.Registracija.getUsername(driver);
		
		strana.Registracija.sendKeysUsername(driver, Excel.getCellData(i, 2));
		
		//Email
		strana.Registracija.getEmail(driver);
		
		strana.Registracija.sendKeysEmail(driver, Excel.getCellData(i, 3));
		
		
		
		//password
		strana.Registracija.getPassword(driver);
		
		strana.Registracija.sendKeysPassword(driver, Excel.getCellData(i, 4));
		
		strana.Registracija.clickRegister(driver);
		
		
	}
	public static void testWithAllData(WebDriver driver) throws Exception {
		Excel.
		setExcelFile
		(constant.PathExcel+constant.FileName,
				constant.SheetName);
		for(int i=0;i<Excel.getWorkSheet().getLastRowNum()+1;i++) {
			fillForm(driver,i);
			strana.Registracija.navigateTo(driver);
		}
		
		
	}
}


