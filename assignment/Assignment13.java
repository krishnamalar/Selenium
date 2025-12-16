package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   //NAVIGATE TO DEMO WEB SHOP
	   driver.get("https://demowebshop.tricentis.com/login");
	   Thread.sleep(2000);
	   
	   //ENTER MOBILES IN THE SEARCH TEXT FIELD
	   driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	   Thread.sleep(2000);
	   //CLICK ON THE SEARCH BUTTON WITHOUT USING CLICK()METHOD 
	   driver.findElement(By.xpath("//input[@value='Search']")).click();
	   Thread.sleep(2000);
	   //CLEAR THE TEXT IN THE TEXT FIELD
	   WebElement ele= driver.findElement(By.id("Q"));
	   ele.clear();
	   Thread.sleep(2000);
	   //REFRESH THE THE PAGE 
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	   
	   //CLICK ON LOGIN 
	   driver.findElement(By.linkText("Log in")).click();
	   
	   Thread.sleep(2000);
	   //VERIFY THE LOGIN IS DISPLAYED IN THE WEBPAGE OR NOT 
	   WebElement ele1=driver.findElement(By.xpath("//input[@value='Log in']"));
	   
	   System.out.println(ele1.isDisplayed());
	   Thread.sleep(2000);
	   //WITHOUT ENTERING USER NAME AND PASSWORD CLICK ON LOGIN BUTTON
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   Thread.sleep(2000);
	   //CAPTURE THE ERROR MESSAGE 
	   String ele2= driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
	   System.out.println(ele2);
	   Thread.sleep(2000);
	   //CLICK ON BOOKS 
	   driver.findElement(By.partialLinkText("Books")).click();
	   Thread.sleep(2000);
	   //CAPTURE THE TAGNAME , CSS VALUE ATTRIBUTE VALUE , HEIGHT ,WIDTH,X,Y AXIS OF THE THIRD ADD TO CART BUTTON 
	   WebElement ele3= driver.findElement(By.xpath("//a[@href='/fiction']/../..//input[@value='Add to cart']"));
	   Thread.sleep(2000);
	   System.out.println(ele3.getAttribute("class"));
	   System.out.println(ele3.getTagName());
	   System.out.println(ele3.getCssValue("color"));
	   System.out.println(ele3.getCssValue("font-size"));
	   System.out.println(ele3.getCssValue("background-color"));
	   Rectangle rect=ele3.getRect();
	   System.out.println(rect.getX());
	   System.out.println(rect.getY());
	   System.out.println(rect.getHeight());
	   System.out.println(rect.getWidth());
	   driver.quit();
	                                                       
	   

	}

}
