package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kumar2004rajkumar@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("krishna2004rajkumar");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	}

}
