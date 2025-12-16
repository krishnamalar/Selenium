package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		// LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
		//NAVIGATE TO THE APPLIOCATION 
		driver.get("https://www.instagram.com/");//If we give the "instagram.com" it is a Partial Qualified Path.So we get "InvalidArgumentException".

	}

}
