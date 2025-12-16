package actions_On_MouseRelated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_ClickOfwe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO DEMO WEB SHOP
        driver.get("https://demowebshop.tricentis.com/login");
        Thread.sleep(2000);
        
        //CLICK ON SEARCH BUTTON BY USING  ACTION CLASS 
        WebElement ele= driver.findElement(By.xpath("//input[@value='Search']"));
        Thread.sleep(2000);
        
       Actions act= new Actions(driver);
       //BY USING CLICK() METHOD
       act.moveToElement(ele).click().perform();
       Thread.sleep(2000);
       //BY USING CLICK(WE) METHOD
      // act.click(ele).perform();
       Thread.sleep(2000);
       driver.quit();
	}

}
