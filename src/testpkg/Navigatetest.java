package testpkg;


import java.time.Duration;

import org.testng.annotations.Test;
import baseclass.Baseclass;
import pagepkg.Navigatepage;

public class Navigatetest  extends Baseclass
{

@Test
public void Test1() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 Navigatepage np=new Navigatepage(driver);
     np.flightclick();
    driver.navigate().refresh();

	 np.setvalues("Brussels ","Newyork");
	 Thread.sleep(3000);

	  np.search();
	  np.travel();
		
}

}

