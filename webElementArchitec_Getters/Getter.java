package webElementArchitec_Getters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		
		//CAPTURE THE HEIGHT & WIDTH & X AXIS Y AXIS OF THE SEARCH BUTTON 
		WebElement size = driver.findElement(By.xpath("//input[@value='Search']"));
		Thread.sleep(2000);
		System.out.println(size.getSize());
		Thread.sleep(2000);
		System.out.println(size.getLocation());
		Thread.sleep(2000);
		driver.quit();
	}
}

