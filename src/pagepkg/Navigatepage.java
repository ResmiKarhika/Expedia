package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import baseclass.Baseclass;

public class Navigatepage extends Baseclass
{
	By flightlink=By.xpath("//div[@class='uitk-tabs-container']/ul/li[2]/a/span");
	By fleave=By.xpath("//input[@id='location-field-leg1-origin']");
	
	By fdest=By.xpath("//input[@id='location-field-leg1-destination']");
    By search=By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button");
    By travel=By.xpath("//*[@id=\"adaptive-menu\"]/button");
   // By Adult=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span/svg");
  
	
	

public Navigatepage(WebDriver driver)
{
	this.driver=driver;
	}

public void setvalues(String lea ,String des)
{
	driver.findElement(fleave).sendKeys(lea);
	driver.findElement(fdest).sendKeys(des);
	
}

public void flightclick()
{
	
	driver.findElement(flightlink).click();
	
}


public void search()
{
	driver.findElement(search).click();

}
public void travel()

{
	driver.findElement(travel).click();
}

}
