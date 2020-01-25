package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalCheck {
	 public static void main(String[] args) throws InterruptedException {
		 
		 String url = "http://the-internet.herokuapp.com/entry_ad";
		 String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-title']")));
		 
		 WebElement modal = driver.findElement(By.xpath("//*[@class='modal-title']"));
		 		 
		 Assert.assertTrue(modal.isDisplayed());
		 
		 
		 driver.findElement(By.xpath("//*[@class='modal-footer']")).click();
		 Thread.sleep(1000);
		 
		 Assert.assertFalse(modal.isDisplayed());
        driver.quit();
	}
}
