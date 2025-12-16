package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rect_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CAPTURE THE HEIGHT AND WIDTH AND X AND Y AXIS USING RECT 
		Rectangle rect= driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println(rect.getX());
		Thread.sleep(2000);
		System.out.println(rect.getY());
		Thread.sleep(2000);
		System.out.println(rect.getHeight());
		driver.quit();

	}

}
