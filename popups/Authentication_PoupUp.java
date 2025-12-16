package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PoupUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGTE TO INTERNET HEROKAPP
		//HERE WE AVOID THE POPUP 
		driver.get("https://authorized:password001@testpages.herokuapp.com/pages/auth/basic-auth/basic-auth-results.html");
		Thread.sleep(2000);
		driver.quit();

	}

}
