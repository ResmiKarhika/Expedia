package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass

{
	public WebDriver driver;
	 @BeforeClass
	 public void preCondition() throws Exception

    { 	 
   	     ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
       driver.get("https://www.Expedia.com");
        driver.manage().window().maximize();
         //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        // Thread.sleep(2000);

    }
  
	 
  @AfterClass

  public void postCondition() 


  {

    //driver.quit();

   }


}
