package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //NAVIGATE TO DEMO WEB SHOP
		 driver.get("https://demowebshop.tricentis.com/login");
		 //ENTER A MOBILE IN THE SEARCH TEXTFIELD 
		 driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
		 //CLICK ON SEARCH BUTTON
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 Thread.sleep(2000);
		 driver.quit();
		

	}

}
