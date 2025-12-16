package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// LAUNCH THE BROWSER
		WebDriver driver = new ChromeDriver();
		
		//NAVIGATE TO THE APPLICATION(FACEBOOK)
		driver.get("https://www.facebook.com/");
		
		//CAPTURE THE TITLE OF THE WEBPAGE
		String title=driver.getTitle();
		System.out.println(title);
		
		//NAVIGATE TO THE APPLICATION(INSTAGRAM)
		driver.get("https://www.instagram.com/");
		
		//CAPTURE THE TITLE OF THE WEBPAGE
		String title1=driver.getTitle();
		System.out.println(title1);
		
		

	}

}
