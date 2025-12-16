package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO EASEMYTRIP 
		driver.get("https://www.easemytrip.com/");
		
		//CLICK ON DEPRATURE AND SELECT AUG 17
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		boolean a= true;
		
		while(a)
	    //for(;;)
		{
		try {
			driver.findElement(By.id("frth_1_17/08/2026")).click();
			a=false;
			
		} catch (Exception e) {
			driver.findElement(By.id("img2Nex")).click();
		}
		}
		driver.quit();

	}

}
