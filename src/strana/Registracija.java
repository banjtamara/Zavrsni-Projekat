package strana;

import org.openqa.selenium.*;
public class Registracija {

	public static final String registracijaFirstName = "//input[@name='firstname']";
	public static final String registracijaLastName = "//input[@name='lastname']";
	public static final String registracijaUsername = "//form[@action='processregister.php']//input[@name='username']";
	public static final String registracijaEmail = "//input[@name='email']";
	public static final String registracijaPassword = "//form[@action='processregister.php']//input[@name='password']";
	public static final String buttomRegister = "//input[@id='blue_btn']";

	// registracijaFirstName
	public static WebElement getFirstName(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(registracijaFirstName));
		return element;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String xxx) {
		getFirstName(driver).sendKeys(xxx);
	}

	// registracijaLastName
	public static WebElement getLastName(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(registracijaLastName));
		return element;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String xxx) {
		getLastName(driver).sendKeys(xxx);
	}

	// registracijaUsername
	public static WebElement getUsername(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(registracijaUsername));
		return element;
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void sendKeysUsername(WebDriver driver, String xxx) {
		getUsername(driver).sendKeys(xxx);
	}

	// registracijaEmail
	public static WebElement getEmail(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(registracijaEmail));
		return element;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String xxx) {
		getEmail(driver).sendKeys(xxx);
	}

	// registracijaPassword
	public static WebElement getPassword(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(registracijaPassword));
		return element;
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void sendKeysPassword(WebDriver driver, String xxx) {
		getPassword(driver).sendKeys(xxx);
	}

	// buttomRegister
	public static WebElement getRegister(WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(buttomRegister));
		return element;
	}

	public static void clickRegister(WebDriver driver) {
			getRegister(driver).click();
		}

	public static void navigateTo(WebDriver driver) {
		
		
	}

}
