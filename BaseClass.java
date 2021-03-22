package Office;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	public class BaseClass 

	{

		WebDriver  driver = null;

		//Prerequisites
		 
		@BeforeMethod
		public  void setup()  

		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Prasad\\\\\\\\Desktop\\\\\\\\chromedriver.exe");
			
	        Reporter.log("====Browser Session Started====",true);
	          
			driver = new  ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
			driver.get("https://staging.bookmycde.com/");
			 Reporter.log("====Application  Started====",true);
		}
		
		@AfterMethod
		public  void teardown() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.close();
			driver.quit();
			Reporter.log("====Browser Session Ended====",true);
		}

		}


