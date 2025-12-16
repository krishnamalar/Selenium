package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //NAVIGATE TO DEMO WEB SHOP
        driver.get("https://demowebshop.tricentis.com/login");
        //ENTER MOBILES IN THE SEARCH TEXT FIELD 
        WebElement ele=  driver.findElement(By.id("small-searchterms"));
        Thread.sleep(2000);
        ele.sendKeys("mobiles");
        Thread.sleep(2000);
        ele.clear();
        Thread.sleep(2000);
        //ENETR  GROCERIES IN THE TEXT FIELD 
        ele.sendKeys("grocerirs");
        Thread.sleep(2000);
        //CLICK ON SEACRCH BUTTON WITHOUT USING CLICK METHOD 
        driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).submit();
        Thread.sleep(2000);
        driver.quit();
        
	}

}
