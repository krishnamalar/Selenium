package webElementArchitec_Getters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Tagname
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO ACTITIME.COM
		driver.get("https://www.actitime.com/");
		//CAPTURE THE ATTRIBUTE VALUE AND CSS VALUE AND TAGNAME 
		WebElement ele=driver.findElement(By.linkText("Get started"));
		Thread.sleep(2000);
		System.out.println( ele.getAttribute("Class value :"+"class"));
		Thread.sleep(2000);
		
		System.out.println(ele.getCssValue("color"));
		System.out.println(ele.getCssValue("font-size"));
		System.out.println(ele.getCssValue("background-color"));
		
		System.out.println(ele.getTagName());
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}