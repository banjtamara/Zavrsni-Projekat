package strana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Excel;
import utils.constant;

public class PostPisi {

	// pisi naziv

	// pisi post
	public static void postPisi(WebDriver driver, int i) throws Exception {

		for (int j = 0; j < 5; j++) {
			DashboardPage.clickDugmeMake(driver);
			DashboardPage.sendKeysNaziv(driver, Excel.getCellData(i, 1));
			Thread.sleep(2000);
			DashboardPage.sendKeysLokacija(driver, Excel.getCellData(i, 2));
			Thread.sleep(2000);
			DashboardPage.sendKeysPisiPost(driver, Excel.getCellData(i, 0));
			Thread.sleep(2000);
			DashboardPage.postClick(driver);

		}

	}

	// dugme salji post
	public static WebElement postDugme(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(DashboardPage.PostClick));
		return element;
	}
}
