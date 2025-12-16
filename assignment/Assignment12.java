package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NAVIGATE TO DEMOWEBSHOP
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//CLICK ON FACEBOOK
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("///div[@aria-label='Close']")).click();
		Thread.sleep(2000);
		//ENTER USERNAME AND PASSWORD 
		driver.findElement(By.id("_r_2b_")).sendKeys("rajkumar");
		Thread.sleep(2000);
		driver.findElement(By.id("_r_2f_")).sendKeys("rajkumar2004");
		Thread.sleep(2000);
		//CLICK ON LOGIN BUTTON
		driver.findElement(By.className("x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x14ldlfn x1b1wa69 xws8118 x5fzff1 x972fbf x10w94by x1qhh985 x14e42zd x9f619 xpdmqnj x1g0dm76 xtvsq51 x1fq8qgq")).clear();
		Thread.sleep(2000);
		driver.quit();

	}

}
