package strana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;

public class LogIn {
	public static final String LogInUserName = "//input[@placeholder='username']";
	public static final String LogInPassword = "//input[@placeholder='password']";
	public static final String LogInButton = "//input[@value='Log in']";
	public static final String LogOut= "//a[@id='logoutBtn']";

//LogIn username
	
	public static WebElement getLogInUserName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LogInUserName));
		return element;
	}

	public static void sendKeysUserName(WebDriver driver, String xxx) throws Exception {
		getLogInUserName(driver).sendKeys(xxx);
	}
	//password
	public static WebElement getLogInPassword(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LogInPassword));
		return element;
	}

	public static void sendKeysPassword(WebDriver driver, String xxx) throws Exception {
		getLogInPassword(driver).sendKeys(xxx);
	}
	
	// login dugme
	public static WebElement getLogIn(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(LogInButton));
		return element;
	}
	
	public static void clickLogin(WebDriver driver) {
		getLogIn(driver).click();
	}
		
	// logout dugme
	public static WebElement getLogOut(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(LogOut));
		return element;
	}
	
	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
		
			
	}}
		
	

