package WenDriverMethod_Manage;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//MAXIMIZE THE WINDOW 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//MINIMIZE THE WINDOW
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//FULLSCREEN THE WINDOW 
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//GETSIZE THE WINDOW 
		org.openqa.selenium.Dimension size =driver.manage().window().getSize();
		System.err.println("Size :"+size);
		Thread.sleep(2000);
		//GET SEPRATE HEIGHT AND WIDTH
		System.out.println("Width :"+size.getWidth());
		System.out.println("Height :"+size.getHeight());
		//SETSIZE THE WINDOW 
		Dimension d= new Dimension(500, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		//GET THE POSITION 
		Point position= driver.manage().window().getPosition();
		System.out.println("Position :"+position);
		Thread.sleep(2000);
		//GET THE SEPRATE X AND Y AXIS 
		System.out.println("X Axis :"+position.getX());
		System.out.println("Y Axis :"+position.getY());
		Thread.sleep(2000);
		//SET THE POSITION 
		Point setposition =new Point(200,400);
		driver.manage().window().setPosition(setposition);
		driver.quit();
		
	}

}
