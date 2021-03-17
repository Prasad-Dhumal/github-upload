package Office;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Bookmycde {
	WebDriver driver = null;

	// Prerequisites

	@BeforeMethod
	public void setup()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Prasad\\\\Desktop\\\\chromedriver.exe");

		Reporter.log("====Browser Session Started====", true);

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://staging.bookmycde.com/");

	}

	public void pagetitle() {

		String Actual = driver.getTitle();
		String Expected = "CDE | BookMyCDE | Continuing Dental Education | Book CDE | Conference";

		assertEquals(Expected, Actual);

	}

	public void tickitbook() throws InterruptedException {

		driver.get("https://staging.bookmycde.com/");
		driver.findElement(By.xpath("//*[@id=\"eventCards0\"]")).click();
		driver.findElement(By.cssSelector("a[id='gtmCDEBookNow']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Prasad");
		driver.findElement(By.id("middleName")).sendKeys("Pradiprao"); 
		driver.findElement(By.id("lastName")).sendKeys("Dhumal"); 
		driver.findElement(By.id("mobileNumber")).sendKeys("9764790479");
		driver.findElement(By.xpath("//div[contains(@class,'checkbox ')]")).click();
		driver.findElement(By.id("email")).sendKeys("prasad.dhumal@healthpole.com");
		driver.findElement(By.id("city")).sendKeys("Pune");
	    driver.findElement(By.id("speciality")).sendKeys("Suegon"); 
	    driver.findElement(By.id("institute")).sendKeys("DY patil college");
	    WebElement drop=driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]"));
		drop.click();
		Thread.sleep(1000);
		for(int i=0;i<=16;i++)
		{
			drop.sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(1000);
		}
		drop.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name=\"council_number\" and @id=\"councilNumber\"]")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name=\"button\" and @id=\"payNow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"step-4\"]/div[10]/div/div/div/div/div/a")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);	//below code for clicking on paynow
		WebElement ele = wait1.until(ExpectedConditions.elementToBeClickable(By.id("payNow1")));
		ele.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);	// below code for clicking on Net Banking
		WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Net Banking')]")));
		element.click();
		driver.findElement(By.xpath("//span[contains(text(),'SBI')]")).click();	// for cliking on SBI button
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"col\"]//button[@id=\"successBtn\"  and @type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name=\"button\" and @class=\"isMobileBooked btn btn-member modal-toggle shareModal\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"modal-close modal-toggle\"]")).click();
	    

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
