package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 //create object of LoginPage
		 
		 LoginPage2 pg= new LoginPage2(driver);
		 
		 driver.get("https://www.saucedemo.com/");
		 pg.enterUsername("standard_user");
		 pg.enterPassword("secret_sauce");
		 pg.clickOnLoginBtn();

		 

	}

}
