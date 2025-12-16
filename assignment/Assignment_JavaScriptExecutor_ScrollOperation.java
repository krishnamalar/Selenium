package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_JavaScriptExecutor_ScrollOperation {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO AMAZON
		driver.get("https://www.amazon.in/All-Shopping/s?k=All+Shopping");
		  Thread.sleep(2000);
		//SEARCH ANY PRODUCT INT SEARCH TEXTFIELD 
		 WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys("Books");
		 Thread.sleep(2000);
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(2000);
		 //CLICK ON THE PRODUCT 
		 driver.findElement(By.xpath("//span[text()='Who Will Cry When You Die?']/../../../../../..//img[@alt='Who Will Cry When You Die?']")).click();
		 Thread.sleep(2000);
		//TYPECASTING THE TAKESSCREENSHORT
		TakesScreenshot ts= (TakesScreenshot) driver;
		//STORE THE SS IN TEMP LOCATION
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//STORE IN THE PERMANENT LOCATION
		File perm = new File("./Screenshorts/amazon.png");
		//COPY THE SS FROM TEMP TO PER LOC
	    org.openqa.selenium.io.FileHandler.copy(temp, perm);
	    Thread.sleep(2000);
	    //REFRESH THE PAGE 
	    driver.navigate().refresh();
	  
	    //PERFORM WINDOW SCROLLING OPERATION
	    //TYPECASTING THE JAVASCRIPTEXECUTOR
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollTo(0,200)");
	    driver.quit();
	    
	    
	}

}
