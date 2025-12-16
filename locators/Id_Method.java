package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Method {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//NAVIGATE TO FACEBOOK 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//ENTER THE USERNAME
		driver.findElement(By.id("email")).sendKeys("rajkumar");
		Thread.sleep(2000);
		//ENTER THE PASSWORD
		driver.findElement(By.id("pass")).sendKeys("rajkumar@2004");
		Thread.sleep(2000);
		driver.quit();

	}

}
