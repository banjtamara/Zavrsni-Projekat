package strana;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Excel;
import utils.constant;

public class popuniLogIn {
	
	public static void logInManuel() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite first name");
		String firstName = sc.nextLine();
		
		System.out.println("Unesite last name");
		String lastName = sc.nextLine();
		
		System.out.println("Unesite UserName");
		String userName = sc.nextLine();
		
		System.out.println("Unesite Email");
		String email = sc.nextLine();
		
		System.out.println("Unesite Password");
		String password = sc.nextLine();
		
		 System.out.println("Unesi Naziv");
		 String naziv = sc.nextLine();
		 
		 System.out.println("Unesi Lokaciju");
		 String lokaciju = sc.nextLine();
		 
		 System.out.println("Unesi Post");
		 String post = sc.nextLine();
		 
		 System.out.println("Izmeni Post");
		 String IzmeniPost = sc.nextLine();
		 
		
		 
		 
		 
		 
		 
		 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(constant.url);
		
		Registracija.sendKeysFirstName(driver, firstName);
		Registracija.sendKeysLastName(driver, lastName);
		Registracija.sendKeysUsername(driver, userName);
		Registracija.sendKeysEmail(driver, email);
		Registracija.sendKeysPassword(driver, password);
		
	
		
		Registracija.clickRegister(driver);
		
		LogIn.sendKeysUserName(driver,userName);
		LogIn.sendKeysPassword(driver,password);
		
		LogIn.clickLogin(driver);
		// provera da li je ulogovan 
		
		if(driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php")) {
			
			// ako je ulogovan klikni na dugme make
			
			DashboardPage.clickDugmeMake(driver);
			
			//klik i unesi naziv koji je poslat preko scannera
			DashboardPage.clickNaziv(driver);
			DashboardPage.sendKeysNaziv(driver, naziv);
			
			//klik i unesi lokaciju  koja je poslat preko scannera
			DashboardPage.clickLokacija(driver);
			DashboardPage.sendKeysLokacija(driver, lokaciju);
			
			//klik i unesi post koja je poslat preko scannera
			DashboardPage.clickPisiPost(driver,post);
			DashboardPage.sendKeysPisiPost(driver, post);
			DashboardPage.postClick(driver);
			
		
		}
	
		
	} 
	
	//popunjava log in iz exel tabele sa username i passwordom
	public static void popuniLogIn(WebDriver driver, int i) throws Exception {
		
		LogIn.getLogInUserName(driver);
		LogIn.sendKeysUserName(driver, Excel.getCellData(i,2));
		
		LogIn.getLogInPassword(driver);
		LogIn.sendKeysPassword(driver, Excel.getCellData(i, 4));
		
		
	LogIn.clickLogin(driver);
	LogIn.clickLogOut(driver);
	
	

}
	
	// uloguj
	
	public static void popuniLogInJedan(WebDriver driver, int i) throws Exception {
		
		LogIn.getLogInUserName(driver);
		LogIn.sendKeysUserName(driver, Excel.getCellData(i,2));
		
		LogIn.getLogInPassword(driver);
		LogIn.sendKeysPassword(driver, Excel.getCellData(i, 4));
		
		
	LogIn.clickLogin(driver);
		
		
	}

}
