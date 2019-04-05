package strana;

import org.openqa.selenium.*;
//otvaranje pocetne strane

public class PocetnaStrana {
	public static final String HomePage = "http://localhost/izlet/";
	
	
	public static WebElement getStrana(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath(HomePage));
		return element;
	}
	public static void openPage(WebDriver driver) {
		driver.get(HomePage);
	
	}}

