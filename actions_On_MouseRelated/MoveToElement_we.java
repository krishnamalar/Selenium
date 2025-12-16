package actions_On_MouseRelated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_we {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		//MOUSE HOVER ON COMPUTERS 
		WebElement ele =driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
        driver.quit();
	}

}
