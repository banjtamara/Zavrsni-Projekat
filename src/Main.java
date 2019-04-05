import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.*;
import strana.LogIn;
import strana.DashboardPage;
import strana.popuniLogIn;
import strana.popunitiFormu;
import strana.PostPisi;

public class Main {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(constant.url);

		String SheetName = "Registracija";
		String FileName = "Data (5).xls";

		try {
			Excel.setExcelFile(constant.PathExcel + constant.FileName, "Registracija");
			for (int i = 1; i < 2; i++) {
				popunitiFormu.popuniFormu(driver, i);
				popuniLogIn.popuniLogIn(driver, i);
			}
			popuniLogIn.popuniLogInJedan(driver, 2);
			Thread.sleep(2000);
			//DashboardPage.clickDugmeMake(driver);
		
//pisiPost.(driver, Excel.);
			Excel.setExcelFile(constant.PathExcel + constant.FileName, "Tekst");
			//DashboardPage.sendKeysLokacija(driver, "abc");
			PostPisi.postPisi(driver, 3);
			//PostPisi.postPisi(driver, 1);
			
	
			DashboardPage.editPostButton(driver);
			Thread.sleep(2000);
			DashboardPage.sendKeysPostDescription(driver, Excel.getCellData(5, 0));
			DashboardPage.clickPostChangeButton(driver);
			Thread.sleep(2000);
			
			for (int i = 0; i < 2; i++) {
				DashboardPage.deletePostButton(driver);
				
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
