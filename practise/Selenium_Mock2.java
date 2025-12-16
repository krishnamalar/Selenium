package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Mock2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO SHOPPER STACK
		driver.get("https://www.shoppersstack.com/products_page/5407");
		//ENTER THE PINCODE
		driver.findElement(By.id("Check Delivery")).sendKeys("606003");
		WebElement ele= driver.findElement(By.id("Check"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		String errormsg= driver.findElement(By.xpath("//p[contains(text(),'Not Deliveriable.')]")).getText();
		 Thread.sleep(2000);
		System.out.println(errormsg);
		driver.findElement(By.id("Add To Cart")).click();
		 Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Password?")).click();
		 Thread.sleep(2000);
		Boolean pro= driver.findElement(By.xpath("//button[text()='Proceed']")).isDisplayed();
		 Thread.sleep(2000);
		System.out.println(pro);
		 WebElement el1=driver.findElement(By.id("email"));
		 Thread.sleep(2000);
		 el1.sendKeys("kjshdkgfjbajshgy@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		 Thread.sleep(2000);
		 String ele2= driver.findElement(By.xpath("//div[contains(text(),'User email kjshdkgfjbajshgy@gmail.com, does not exist')]")).getText();
		 Thread.sleep(2000);
		 System.out.println(ele2);
		 Thread.sleep(2000);
		 driver.quit();
		

	}

}
