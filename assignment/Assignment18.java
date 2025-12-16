
package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO AMAZON
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//SELECT  THE CAR & MOTORBIKE
		Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(2000);
		sel.selectByVisibleText("Car & Motorbike");
		Thread.sleep(2000);
		driver.quit();
	}

}
