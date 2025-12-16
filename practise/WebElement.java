package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//NAVIGATE TO DEMO WEB SHOP 
		//CLICK ON REGISTER AND ENTER THE DETAILS 
		//CLICK ON LOGIN AND ENTER THE USER NAME AND PASSWORD
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP 
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON REGISTER AND ENTER THE DETAILS 
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//label[@for='gender-male']/..//input[@name='Gender']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("rajkumar");
		driver.findElement(By.id("LastName")).sendKeys("k");
		driver.findElement(By.id("Email")).sendKeys("kumar2004rajkumar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rajkumar2004");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rajkumar2004");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		//CLICK ON LOGIN AND ENTER THE USER NAME AND PASSWORD
		driver.findElement(By.linkText("Log in")).click();
		org.openqa.selenium.WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("kumar2003rajkumar@gmail.com");
		Thread.sleep(2000);
		org.openqa.selenium.WebElement pass=  driver.findElement(By.id("Password"));
		pass.sendKeys("rajkumar2003");
		Thread.sleep(2000);
		org.openqa.selenium.WebElement login =driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
		Thread.sleep(2000);
		String ele =driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
		System.out.println(ele);
		Thread.sleep(2000);
        driver.navigate().refresh();
		Thread.sleep(2000);
		username.sendKeys("kumar2004rajkumar@gmail.com");
		pass.sendKeys("rajkumar2004");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
		
		

	}

}
