package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO THE APPLICATION 
		driver.get("https://www.instagram.com/");
		//CAPTURE THE SOURCE CODE OF THE APPLICATION 
		String pagesource=driver.getPageSource();
	    System.out.println(pagesource);
	    driver.quit();

	}

}
