package strana;

import org.openqa.selenium.WebDriver;

import utils.Excel;

public class popunitiFormu {
	
	public static void popuniFormu(WebDriver driver, int i) throws Exception {
	
		
	Registracija.clickFirstName(driver);
	Registracija.sendKeysFirstName(driver, Excel.getCellData(i, 0));
	
	Registracija.clickLastName(driver);
	Registracija.sendKeysLastName(driver,Excel.getCellData(i,1));
	
	Registracija.clickUsername(driver);
	Registracija.sendKeysUsername(driver, Excel.getCellData(i,2));
	
	Registracija.clickEmail(driver);
	Registracija.sendKeysEmail(driver, Excel.getCellData(i,3));
		
	
	Registracija.clickPassword(driver);
	Registracija.sendKeysPassword(driver, Excel.getCellData(i,4));
	
	
Registracija.clickRegister(driver);

}
}