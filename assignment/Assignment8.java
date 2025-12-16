package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMO WEB SHOP
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement ele= driver.findElement(By.id("small-searchterms"));
		String a=ele.getAttribute("small-searchterms");
		String b=ele.getTagName();
		System.out.println(a);
		System.out.println(b);
		driver.quit();

	}

}

