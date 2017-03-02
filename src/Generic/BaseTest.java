package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest implements AutoConst  {
public WebDriver driver;
@BeforeSuite
public void precondition()
{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost");
	
}
@AfterMethod
public void postCondition()
{
	driver.quit();
}

	
}
