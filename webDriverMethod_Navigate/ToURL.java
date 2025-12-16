package webDriverMethod_Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //NAVIGATE TO THE APPLICATION WITHOUT USING GET() AND TO (STRING URL)
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		 Thread.sleep(2000);
		 driver.quit();

	}

}
