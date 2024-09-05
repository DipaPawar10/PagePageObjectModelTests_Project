package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) {

		 System.setProperty("webdriver.driver.chrome", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/");
		 
	}

}
