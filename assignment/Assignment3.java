package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CAPTURE THE TITLE OF THE WEBPAGE 
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		Thread.sleep(2000);
		//CAPTURE THE URL OF THE WEBPAGE 
		String url=driver.getCurrentUrl();
		System.out.println("Url :"+url);
		Thread.sleep(2000);
		//CAPTURE THE SIZE OF THE WEBPAGE 
		Dimension size =driver.manage().window().getSize();
		System.out.println("Size :"+size);
		Thread.sleep(2000);
		//RESIZE THE SIZE OF THE WEBPAGE
		Dimension d = new Dimension(500,500);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//CAPTURE THE POSITION OF THE WEBPAGE
		Point position = driver.manage().window().getPosition();
		System.out.println("Position :"+position);
		Thread.sleep(2000);
		//RESIZE THE POSITION OF THE WEBPAGE
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		driver.quit();

	}

}
