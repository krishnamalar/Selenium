package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO NAUKRI
		driver.get("https://www.naukri.com/");
		//CLICK ON REGISTER 
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\HP\\OneDrive\\Downloads\\ChandraKumar CV (1).pdf");
		Thread.sleep(2000);
		driver.quit();

	}

}
