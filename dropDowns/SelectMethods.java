package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON BOOKS 
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		//SELECT THE DROPDOWNS
		//SELECT THE SORTBY DROPDOWN  HIGH TO LOW 
		 Select sel=new Select(driver.findElement(By.id("products-orderby")));
		 sel.selectByVisibleText("Price: High to Low");
		 Thread.sleep(2000);
		
		 
		 //SLECT THE DISPLAY DROPDOWN AND SELECT 12
		 Select sel1= new Select(driver.findElement(By.id("products-pagesize")));
		 sel1.selectByIndex(2);
		 Thread.sleep(2000);
		 
		 //SELECT THE VIEWAS DROPDOWN TO SELECT THE LIST 
		 Select sel2= new Select(driver.findElement(By.id("products-viewmode")));
		 sel2.selectByIndex(1);
		 Thread.sleep(2000);
		 
		 driver.quit();

	}

}
