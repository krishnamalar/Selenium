package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO FLAGS OF WORLD
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		//TYPECASTING THE JAVASCRIPTEXECUTOR
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		
		//SCROLL TO
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		driver.quit();

	}

}
