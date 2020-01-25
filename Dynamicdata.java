package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicdata {
	 public static void main(String[] args) throws InterruptedException {
		 
		 
		 String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
		 driver.get(url);
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("start")));
		 driver.findElement(By.xpath("//*[contains(text(),'Start')]")).click();
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		 
		 String result = driver.findElement(By.id("finish")).getText();
		 		 
		 //System.out.println(result);
		 Assert.assertEquals(result, "Hello World!");
		
        driver.quit();
	}
}
