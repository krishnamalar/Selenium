package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		List<WebElement> input=driver.findElements(By.tagName("input"));
		List<WebElement> a=driver.findElements(By.tagName("a"));

		System.out.println("No of input tages are present :" +input);
		
		//click on register by using classname 
		driver.findElement(By.className("ico-register")).click();
		driver.quit();
		
		

	}

}
