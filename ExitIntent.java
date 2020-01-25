package automation;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExitIntent {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		   
	       
	       String homePage = "http://the-internet.herokuapp.com/exit_intent";

	       String exePath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
			 WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get(homePage);
	       
	         
	       Robot robot = new Robot();
	       robot.mouseMove(600,0);
	       Thread.sleep(3000);

	
	       String res = driver.findElement(By.xpath("//*[@class='modal-title']")).getText();
	       //System.out.println(res);
	       Assert.assertEquals("THIS IS A MODAL WINDOW", res);

	       driver.quit();

	   }
}
