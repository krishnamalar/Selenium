package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Svg_Tag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO INSTAGRAM
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//CLICK ON THE FACEBOOK LOGO 
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Log in with Facebook']")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
