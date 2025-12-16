package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO FACEBOOK 
		driver.get("https://www.facebook.com/");
		
		//CLICK ON CREATE A NEW ACCOUNT 
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//SELECT THE DATE OF BIRTH 
		Select sel= new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		Select sel1 =new Select(driver.findElement(By.id("month")));
		sel1.selectByVisibleText("May");
		Thread.sleep(2000);
		
		Select sel2 =new Select(driver.findElement(By.id("year")));
		sel2.selectByVisibleText("2004");
		Thread.sleep(2000);
		 driver.quit();
		

	}

}
