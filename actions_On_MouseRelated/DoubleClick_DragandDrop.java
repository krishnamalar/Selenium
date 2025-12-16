package actions_On_MouseRelated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO SELENIUM DIV
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(2000);
		
		//DOUBLE CLICK
		WebElement ele = driver.findElement(By.id("clickable"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		//act.moveToElement(ele).doubleClick().perform();
		Thread.sleep(2000);
		
		//DRAG AND DROP
		WebElement src= driver.findElement(By.id("draggable"));
		WebElement desti =driver.findElement(By.id("droppable"));
		
		Actions act1= new Actions(driver);
		act1.dragAndDrop(src, desti).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
