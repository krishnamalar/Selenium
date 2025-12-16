package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP 
		driver.get("https://www.amazon.in/online-shopping/s?k=online+shopping");
		Thread.sleep(2000);
		List<WebElement> ele= driver.findElements(By.xpath("//*[name()='svg']"));
		for(WebElement ele1 : ele)
		{
			System.out.println(ele);
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
