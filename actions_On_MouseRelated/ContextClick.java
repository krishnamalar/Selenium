package actions_On_MouseRelated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO SWISNIL.GITHUB.IO
		driver.get("https://swisnl.github.io/");
		Thread.sleep(2000);
		
		//CLICK ON JQUERY 
		driver.findElement(By.linkText("jQuery-contextMenu")).click();
		Thread.sleep(2000);
		
		//CLICK ON DEMO GALLERY
		driver.findElement(By.partialLinkText("Demo gallery")).click();
		Thread.sleep(2000);
		
		//PERFORM CONTEXT CLIK 
		WebElement ele= driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(2000);
		
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).contextClick().perform();
		
		// act.contextClick(ele).perform();
		Thread.sleep(2000);
		driver.quit();
		}

}
