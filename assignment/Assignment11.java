package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON DIGITAL DOWNLOADS 
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		Thread.sleep(2000);
		//CLICK THIRD ADD TO CART
		driver.findElement(By.xpath("//a[@href='/music-2']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		String ele=driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your ')]")).getText();
		System.out.println(ele);
		driver.navigate().refresh();
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String ele1=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
		System.out.println(ele1);
		Thread.sleep(2000);
		driver.quit();

	}

}
