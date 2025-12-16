package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		 // CLICK ON REGISTER
		//LINK_TEXT METHOD
		driver.findElement(By.linkText("Register"));
		Thread.sleep(2000);
		//PARTIAL_LINK_TEXT METHOD
		driver.findElement(By.partialLinkText("Log"));
		Thread.sleep(2000);
		
		driver.quit();

	}

}
