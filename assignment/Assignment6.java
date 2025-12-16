package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 //NAVIGATE TO INSTAGRAM
		 driver.get("https://www.instagram.com/");
		 //CAPTURE THE TITLE & URL OF THE WEB PAGE
		 String url=driver.getCurrentUrl();
		 System.out.println("URL :"+url);
		 String title=driver.getTitle();
		 System.out.println("TITLE :"+title);
		 Thread.sleep(2000);
		 //ENTER THE USERNAME
		 driver.findElement(By.name("username")).sendKeys("rajkumar2004@gmail.com");
		 Thread.sleep(2000);
		 //ENTER THE PASSWORD
		 driver.findElement(By.name("password")).sendKeys("krishna2004rjkumar");
		 Thread.sleep(2000);
		 //FULLSCREEN THE WEBPAGE
		 driver.manage().window().fullscreen();
		 driver.quit();

	}

}
