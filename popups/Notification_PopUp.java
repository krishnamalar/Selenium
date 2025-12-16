package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//CREATE OBJECT FOR BROWSER SPECIFIC OPTIONS
		ChromeOptions option = new ChromeOptions();
		//ADD CHROMIUM COMMANDS
		option.addArguments("--disable-notification");
		//PASS THE REFERENCE VARIABLE TO THE FIRST LINE OF THE CODE +
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO EASEMYTRIP APPLICATION TO AVOID THE NOTIFICATION POPUP
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(4000);
        driver.quit();		

	}

}
