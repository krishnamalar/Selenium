package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //NAVIGATE TO FLIPKART
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 //NAVIGATE TO AMAZON
		 driver.get("https://www.amazon.in/All-Shopping/s?k=All+Shopping");
		 Thread.sleep(2000);
		 String url=driver.getCurrentUrl();
		 System.out.println("URL :"+url);
		 String title =driver.getTitle();
		 System.out.println("TITLE :"+title);
		 //BACK TO FLIPKART
		 driver.navigate().back();
		 Thread.sleep(2000);
		 //FORWARD TO THE AMAZON
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 //CAPTURE THE PAGESOURCE OF THE APPLICATION 
		 String pagesource= driver.getPageSource();
		 Thread.sleep(2000);
		 //CAPTURE THE SIZE OF THE APPLICATION 
		 Dimension size = driver.manage().window().getSize();
		 System.out.println("SIZE :"+size);
		 driver.quit();
	}

}
