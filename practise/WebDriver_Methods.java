package practise;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIAGTE TO AMAZON APP
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("Title "+title);
		String url =driver.getCurrentUrl();
		System.out.println("Url"+url);
		String sourcecode= driver.getPageSource();
		System.out.println("PageSource"+sourcecode);
		org.openqa.selenium.Dimension size= driver.manage().window().getSize();
		System.out.println("Size "+size);
		org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(500, 500);
		driver.manage().window().setSize(dim);
		Point position = driver.manage().window().getPosition();
		System.out.println("position "+position);
		Point p =new Point(500, 5000);
		driver.manage().window().setPosition(p);
		
		
		driver.quit();
		
		
			
	}

}
