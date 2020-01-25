package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	 public static void main(String[] args) throws InterruptedException {
		 
		 String url = "http://the-internet.herokuapp.com/login";
		 String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "username")));
		 
		 driver.findElement(By.id("username")).sendKeys("tomsmith");
		 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		 
		 WebElement Submit = driver.findElement(By.xpath("//*[@type='submit']"));
		 Submit.click();
		 
		 WebElement logout = driver.findElement(By.xpath("//*[@class='button secondary radius']"));
		 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@class='button secondary radius']")));
		 
		 Assert.assertTrue(logout.isDisplayed());
		 
		 
		 driver.findElement(By.xpath("//*[@class='button secondary radius']")).click();
		 
		 Assert.assertTrue(Submit.isDisplayed());
        driver.quit();
	}
}
