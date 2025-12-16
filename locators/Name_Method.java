package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO INSTAGRAM 
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//ENTER THE USERNAME
		driver.findElement(By.name("username")).sendKeys("rajkumar");
		//ENTER THE PASSWORD 
		driver.findElement(By.name("password")).sendKeys("rajkumar2004rajkumar");
		 driver.quit();
		 
		

	}

}
