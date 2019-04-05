package strana;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	public static final String postDugme="//a[contains(text(),'Make a post')]";
	public static final String PostNaziv = "//input[@placeholder='Naziv']";
	public static final String PostLokacija = "//input[@placeholder='Lokacija']";
	public static final String Post = "//textarea[@placeholder='Opis']";
	public static final String PostClick = "//input[@value='Post']";
	public static final String functionButton = "fa-ellipsis-v";
    public static final String deleteButton = "fa-trash-alt";
    public static final String editButton = "fa-edit";
    public static final String descriptionEdit = "//textarea[@id='description']";
    public static final String postChangeButton = "//div[@class='popupEdit']//input[@value='Post']";
 
	
	
	//klik na dugme make za post
	
	public static WebElement dugmeMake (WebDriver driver) {
		WebElement element = (WebElement) driver.findElement(By.xpath(postDugme));
		return element;
	}
	public static void clickDugmeMake (WebDriver driver) {
		dugmeMake(driver).click();
		
	}

	public static void clickNaziv(WebDriver driver) {
		getNaziv(driver).click();
	}

	
	// polje naziv
		public static WebElement getNaziv (WebDriver driver) {
			WebElement element = (WebElement) driver.findElement(By.xpath(PostNaziv));
			return element;
		}

		public static void sendKeysNaziv(WebDriver driver, String xxx) {
			getNaziv(driver).sendKeys(xxx);
		}
//polje Lokacija
		public static WebElement getLokacija (WebDriver driver) {
			WebElement element = (WebElement) driver.findElement(By.xpath(PostLokacija));
			return element;
		}

		public static void clickLokacija(WebDriver driver) {
			getLokacija(driver).click();
		}

		public static void sendKeysLokacija(WebDriver driver, String xxx) {
			getLokacija(driver).sendKeys(xxx);
		}
	
	
	public static WebElement getPisiPost(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(Post));
		return element;
	}
		public static void clickPisiPost(WebDriver driver, String xxx) {
			getPisiPost(driver).click();
		}
			public static void sendKeysPisiPost(WebDriver driver, String xxx) {
				getPisiPost(driver).sendKeys(xxx);
			
}
			public static WebElement getPostClick(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath(PostClick));
				return element;
			}
			public static void postClick(WebDriver driver) {
				getPostClick(driver).click();
			
}
		
			public static WebElement getFunctionButton(WebDriver driver) {
			       WebElement element = driver.findElement(By.className(functionButton));
			       return element;
			   }

			   public static void functionButton(WebDriver driver) {
			       List<WebElement> menu = driver.findElements(By.className(functionButton));
			       menu.get(0).click();
			   }
			   public static void deletePostButton(WebDriver driver) {
			       functionButton(driver);
			       List<WebElement> delete = driver.findElements(By.className(deleteButton));
			       delete.get(0).click();
			   }
			   public static void editPostButton(WebDriver driver) {
			       functionButton(driver);
			       List<WebElement> edit = driver.findElements(By.className(editButton));
			      edit.get(0).click();
			   }
				
				public static void sendKeysPostDescription(WebDriver driver, String xxx) {
			        WebElement element = driver.findElement(By.xpath(descriptionEdit));
			            element.clear();
			            element.sendKeys(xxx);
			    }
				
				public static WebElement getPostChangeButton (WebDriver driver) {
					WebElement element = (WebElement) driver.findElement(By.xpath(postChangeButton));
					return element;
				}

				public static void clickPostChangeButton(WebDriver driver) {
					getPostChangeButton(driver).click();
				}
}
