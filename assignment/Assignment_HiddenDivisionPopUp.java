package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIAGTE TO MAKEMYTRIP
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&ef_id=:G:s");
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		//CLICK ON DEPRATURE 
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		boolean a= true;
		while(a)
		{
			try {
				driver.findElement(By.xpath("//div[@aria-label='Fri May 01 2026']")).click();
				a=false;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
			
		driver.quit();

	}

}
