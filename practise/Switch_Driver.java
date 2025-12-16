package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		
		//CLICK ON FACEBOOK
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		
		//CLICK ON TWITTER
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
			
		//CLICK ON YOUTUBE 
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		
		
		String parentId= driver.getWindowHandle();
        Set<String> allId= driver.getWindowHandles();
        allId.remove(parentId);
        
        for(String win :allId)
        {
        	driver.switchTo().window(win);
        	Thread.sleep(2000);
        	String title=driver.getTitle();
        	if(title.contains("Facebook"))
        	{
        		driver.close();
        		Thread.sleep(2000);
        	}
        	else if(title.contains("Twitter"))
        	{
        		driver.close();
        		Thread.sleep(2000);
        		
        	}
 
        	else if(title.contains("Youtube"))
        	{
        		driver.findElement(By.name("search_query")).sendKeys("thalapathy kacheri song ");
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//button[@title='Search']")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.partialLinkText("Jana Nayagan")).click();
        		Thread.sleep(80000);
        	}
        	/*else
        	{
        		if((title.contains("Google+")))
        		{
        			driver.findElement(By.partialLinkText("Products")).click();
        			driver.findElement(By.linkText("Get started")).click();
        		}
        		
        	}*/
        }
        driver.quit();
        
	}

}
