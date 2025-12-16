package webElementArchitect_Verifivation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //NAVIGATE TO DEMO WEBSHOP
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    //CHECK THE COMMUNITY IS SELECTED OR NOT 
	    WebElement ele= driver.findElement(By.xpath("//label[@for='pollanswers-1']/..//input[@value='1']"));
	    Thread.sleep(2000);
	    System.out.println("Before selected :"+ele.isSelected());
	    Thread.sleep(2000);
	    ele.click();
	    Thread.sleep(2000);
	    System.out.println("After selected :"+ele.isSelected());
	    Thread.sleep(2000);
	    driver.quit();

	}

}
