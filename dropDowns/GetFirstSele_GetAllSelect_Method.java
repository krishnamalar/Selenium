package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSele_GetAllSelect_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//NAVIGATE TO DEMOAPPS.QSPIDERS
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		Select  sel = new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(0);
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		
		WebElement first= sel.getFirstSelectedOption();
		System.out.println(first.getText());
		
		List<WebElement> allele=sel.getAllSelectedOptions();
		for(WebElement option :allele)
		{
			System.out.println(option.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
