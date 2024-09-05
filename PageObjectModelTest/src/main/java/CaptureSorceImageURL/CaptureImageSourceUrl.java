package CaptureSorceImageURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureImageSourceUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement imgLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		//capture src attribute value
		System.out.println("Src attribute value:" + imgLogo.getAttribute("src"));
		driver.quit();

	}

}
