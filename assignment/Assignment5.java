package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//NAVIGATE TO SHOPPERSTACK
		driver.get("https://www.shoppersstack.com/");
		String url = driver.getCurrentUrl();
		System.out.println("URL :"+url);
		Dimension size=driver.manage().window().getSize();
		System.out.println("SIZE :"+size);
		System.out.println("WIDTH :"+size.getWidth());
		System.out.println("HEIGHT :"+size.getHeight());
		Point position=driver.manage().window().getPosition();
		System.out.println("POSITION :"+position);
		System.out.println("X AXIS :"+position.getX());
		System.out.println("Y AXIS :"+position.getY());
		driver.navigate().refresh();
		Dimension d= new Dimension(500,500);
		driver.manage().window().setSize(d);
		driver.quit();

	}

}
