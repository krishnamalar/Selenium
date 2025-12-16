package assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO FACEBOOK
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	   WebElement ele=driver.findElement(By.name("login"));
	   Rectangle rect=ele.getRect();
	   System.out.println(rect.x);
	   System.out.println(rect.y);
	   System.out.println(rect.height);
	   System.out.println(rect.width);
	   driver.quit();

	}

}
