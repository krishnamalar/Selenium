package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO  DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		//CLICK ON DIGITAL DOWNLOADS 
		driver.findElement(By.partialLinkText("Digital ")).click();
		Thread.sleep(2000);
		
		//SELECT  Z TO A IN SORTBY
		Select sel= new Select(driver.findElement(By.id("products-orderby")));
		sel.selectByVisibleText("Name: Z to A");
		Thread.sleep(2000);
		
		//SELECT 12 IN DISPLAY DROPDOWN 
		Select sel1=new Select(driver.findElement(By.id("products-pagesize")));
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		
		//SELECT LIST IN THE VIEWAS DROPDOWN
		Select sel2= new Select(driver.findElement(By.id("products-viewmode")));
		sel2.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
