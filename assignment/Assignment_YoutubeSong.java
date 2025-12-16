package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_YoutubeSong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO YOUTUBE
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//SEARCH A SONG 
		driver.findElement(By.name("search_query")).sendKeys("Konjam Konjam song ");
		Thread.sleep(2000);
	
	    driver.findElement(By.xpath("//button[@title='Search']")).click();
	    
	    //PLAY  THE SONG
	  	 driver.findElement(By.partialLinkText("Naan Ee")).click();
	  	 Thread.sleep(100000);
	  	
		driver.quit();

	}

}
