package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_Selector_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//ENTER A MAIL IN NEWSLETTER TEXTFIELD
		driver.findElement(By.id("newsletter-email")).sendKeys("kumar2004rajkumar@gmail.com");
		Thread.sleep(2000);
		//CLICK ON SUBSCRIBE
		driver.findElement(By.cssSelector("input[value='Subscribe']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
