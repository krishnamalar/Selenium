package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO INSTAGRAM
		driver.get("https://www.instagram.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		Thread.sleep(2000);
		//STORE THE SS IN TEMP LOCATION
		File temp= ts.getScreenshotAs(OutputType.FILE);
		//STORE THE SS IN PER LOCATION
		File per = new File("./short1/insta.png");
		//COPY THE SS TEMP TO PER
		FileHandler.copy(temp, per);
		driver.quit();
		

	}

}
