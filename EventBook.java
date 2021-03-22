package Office;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class EventBook extends BaseClass { 

	@Test(priority=1) //EventBook

	public void  EventBook() throws InterruptedException, AWTException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/aside/a/div/div[1]/img[1]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/a/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/input")).sendKeys("First Name");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/input")).sendKeys("Middle Name");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[4]/div/div/input")).sendKeys("Last Name");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div[1]/input")).sendKeys("8421222768");
		Thread.sleep(2000L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div[3]")).click();

		Thread.sleep(2000L);
		driver.findElement(By.xpath("//html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[7]/div/div/input")).sendKeys("sumit.wattamwar@gmail.com");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[9]/div/div/input")).sendKeys("Jintur");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[12]/div/div/input")).sendKeys("Dentistry");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[13]/div/div/input")).sendKeys("institute");
		Thread.sleep(2000L);
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"select2-select2-container\"]"));
		drop.click();
		Thread.sleep(2000L);
		Robot r = new Robot();
		Thread.sleep(200L);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200L);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200L);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200L);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200L);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		   
	    Thread.sleep(2000L);        
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div[3]/div/div/div/input")).sendKeys("1234555");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[7]/div/div/div/div/div/button")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[5]/div[4]/div/div/div/div/div/a")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/form/div/div[3]/div/div/div/div/div/button")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[2]/div[3]/div/div/div/span")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id=\"successBtn\"]")).click();

		Thread.sleep(2000L);
		String Expected = "Thank you for booking via BookMyCDE. Ticket has been sent to your email ID.";
		String Actual = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/div[2]/p[2]")).getText();
		
		Assert.assertEquals(Expected, Actual);		

		Reporter.log("==== Event Booked Successfully ====",true);
		//share ticket
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/a/button")).click();
		Thread.sleep(2000L);
		
		//copy link
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div[2]/div/div/div[2]/div[2]/span")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div[2]/div/div/button")).click();
		
		//resend booking details
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/span")).click();
	}
}