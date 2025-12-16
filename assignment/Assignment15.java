package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON FACEBOOK 
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		//CLICK ON YOUTUBE
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> allId =driver.getWindowHandles();
		Thread.sleep(2000);
		allId.remove(parentId);
		Thread.sleep(2000);
		//CLOSE THE FACEBOOK 
		for(String wid :allId)
		{
		 driver.switchTo().window(wid);
		 Thread.sleep(2000);
		 String title=driver.getTitle();
		 if(title.contains("Facebook"))
		 {
			 driver.close();
			 Thread.sleep(2000);
		 }
		 else {
			 if(title.contains("YouTube"))
			 {
				 Thread.sleep(2000);
				 driver.findElement(By.name("search_query")).sendKeys("monika song  ");
				 driver.findElement(By.xpath("//button[@title='Search']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.partialLinkText("Monica ")).click();
				 Thread.sleep(100000);
			 }
			 
		 }
		}
		driver.quit();
}

}
