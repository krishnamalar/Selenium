package webDriverMethod_Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forward_Back_Refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// NAVIGATE TO INSTAGRAM
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//NAVIGATE TO FACEBOOK
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//NAVIGATE TO BACK TO INSTAGRAM
		driver.navigate().back();
		Thread.sleep(2000);
		// NAVIGATE TO FORWARD TO FACEBOOK
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//REFRESH THE PAGE 
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
