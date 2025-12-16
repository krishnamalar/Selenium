package assignment;
import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//NAVIGATE TO DEMO WEBSHOP
			driver.get("https://demowebshop.tricentis.com/login");
			Thread.sleep(2000);
			//CLICK ON BOOKS 
			driver.findElement(By.partialLinkText("Books")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/health']/../..//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			String ele= driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your ')]")).getText();
			Thread.sleep(2000);
			System.out.println(ele);
			driver.quit();

		}


}
