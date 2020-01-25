package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infinitescroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		     String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
			 WebDriver driver = new ChromeDriver();
	       
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		        driver.get("http://the-internet.herokuapp.com/infinite_scroll");
		
		        driver.manage().window().maximize();
	       
	      // System.out.println(driver.manage().window().getSize().getHeight());
	       
	       for (int i=0;i<4;i++){
	    	   js.executeScript("window.scrollBy(0,744)");
	       }
	       
	       Thread.sleep(3000);
	       
	       String res = driver.findElement(By.xpath("//div[@class='jscroll-added']")).getText();
	       System.out.println(res);
	        driver.quit();

	   }

}
