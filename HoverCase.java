package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverCase {
	 public static void main(String[] args) throws InterruptedException {
		 
		 String url = "http://the-internet.herokuapp.com/hovers";
		 String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@alt='User Avatar'])[1]")));
		 
		 Actions actions = new Actions(driver);
		 WebElement menuOption = driver.findElement(By.xpath("(//*[@alt='User Avatar'])[1]"));
	    
	    actions.moveToElement(menuOption).perform();
		 Thread.sleep(1000);
		
		 String res = driver.findElement(By.xpath("//*[contains(text(),'user1')]")).getText();
		 //System.out.println(res);
		 Assert.assertEquals("name: user1", res);
		

		 
		 
        driver.quit();
	}
}
