package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO INSTAGRAM
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		String url =driver.getCurrentUrl();
		System.out.println("URL :"+url);
		Thread.sleep(2000);
		//CAPTURE THE SIZE 
		Dimension size=driver.manage().window().getSize();
		System.out.println("Size :"+size);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//SEPRATE HEIGHT AND  WIDTH
		System.out.println("Width :"+size.getWidth());
		System.out.println("Height :"+size.getHeight());
		driver.quit(); 
		
	}

}
