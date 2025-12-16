package webElementArchitect_Verifivation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO INSTAGRAM
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//CHECK WHETHER LOGIN BUTTON IS ENABLED OR NOT 
		WebElement ele= driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before adding 6 char "+ele.isEnabled());
		Thread.sleep(2000);
		//ENTER THE US AND PWD
		driver.findElement(By.name("username")).sendKeys("kumar2004rajkumar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("rajkumar2004rajkumar");
		Thread.sleep(2000);
		System.out.println("After adding 6 char "+ele.isEnabled());
		Thread.sleep(2000);
		driver.quit();

	}

}
