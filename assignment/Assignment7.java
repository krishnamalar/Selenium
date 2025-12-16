package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //NAVIGATE TO DEMOWEBSHOP
		 driver.get("https://demowebshop.tricentis.com/login");
		 Thread.sleep(2000);
		 //CLICK ON REGISTER 
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(2000);
		 //ENTER ALL THE DETAILS
		 //CLICK THE RADIO BUTTON
		 driver.findElement(By.id("gender-male")).click();
		 Thread.sleep(2000);
		 //ENTER THE NAME IN THE TEXTFIELD
		 driver.findElement(By.id("FirstName")).sendKeys("rajkumar");
		 Thread.sleep(2000);
		 //ENTER THE LASTNAME IN THE TEXTFIELD
		 driver.findElement(By.id("LastName")).sendKeys("k");
		 Thread.sleep(2000);
		 //ENTER THE EMAIL IN THE TEXTFIELD
		 driver.findElement(By.id("Email")).sendKeys("kumar2004rajkumar@gmail.com");
		 Thread.sleep(2000);
		 //ENTER THE PASSWORD IN THE TEXTFIELD
		 driver.findElement(By.id("Password")).sendKeys("rajkumar2004");
		 Thread.sleep(2000);
		 //ENTER THE CONFIRMPASSWORD IN THE TEXTFIELD
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("rajkumar2004");
		 Thread.sleep(2000);
		 //CLICK ON REGISTER 
		 driver.findElement(By.id("register-button")).click();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
