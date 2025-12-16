package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO THE APPLICATION 
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		driver.close();
		

	}

}
