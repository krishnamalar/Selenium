package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_TackScreenShort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON BOOKS 
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/fiction']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		//TYPECATING TO TACKESSCREENSHORT
		
	    WebElement ele=	driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your ')]"));
	    
		//STORE SS IN TEMP LOCATION
		File temp= ele.getScreenshotAs(OutputType.FILE);
		//STORE THE SS IN THE PERMENT LOCATION 
		File per=new File("./Screenshorts/Short1.png");
		org.openqa.selenium.io.FileHandler.copy(temp, per);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//CLICK ON SEARCH FIELD WITHOUT ENTER ANYTHING 
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		//Thread.sleep(2000);
		
		//TYPECASTING TO TAKESCREENSHORT
		TakesScreenshot ts= (TakesScreenshot) driver;
		//STORE THE SS IN THE TEMP LOCATION 
		File temp1= ts.getScreenshotAs(OutputType.FILE);
		//STORE THE SS IN PER LOCATION
		File per1=new File("./Screenshorts/Short2.png");
		org.openqa.selenium.io.FileHandler.copy(temp1, per1);
		Thread.sleep(2000);
		driver.quit();
		
	

	}

}
