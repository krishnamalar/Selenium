package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		 String ele=driver.getTitle();
		 driver.findElement(By.id("APjFqb")).sendKeys("Selenium Web driver");
		 driver.findElement(By.xpath("//span[text()='AI மோட்']")).click();
		 String title = driver.getTitle();
		 if(title.contains("Selenium Web driver"))
		 {
			 System.out.println("Yes the Page is displaying ");
		 }
		 else {
			 System.out.println("the page is not displaying ");
		 }
		 System.out.println(ele);
	     driver.quit();

	}

}
