package uptake.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uptake.automation.*;

public class MainUptakeTest {
	
	public static Driver driver ;
	
	@BeforeClass
	public void initialize(){
		driver = new Driver();
		driver.init();
		driver.go();
	}
	
	
	@Test
	public void PagelaunchTest(){
		String url = "https://www.uptake.com/";
		Assert.assertEquals(driver.getUrl(), url);
	}
	
	@Test
	//@Parameters("linkText")
	public void PageLinkTest(){
		driver.navigateToURL();		
		driver.getUrl();
		Assert.assertEquals(driver.getUrl(), "https://www.uptake.com/approach");
		
		
	}
	
}
