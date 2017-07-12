package uptake.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import uptake.automation.*;
import uptake.pageobjects.HomePage;

public class MainUptakeTest {
	
	//public static Driver driver ;
	public static HomePage home;
	
	@BeforeClass
	public void initializeTest(){
		home = new HomePage();
		home.init();
		assertNotNull(home,"Driver not initialized from home page");
	}
	
	@Test
	public void baseURLTest(){
		home.baseURL();
		String url = "https://www.uptake.com/";
		assertEquals(url,home.getUrl());
	}
	
	@Test
	public void navigateURLTest(){
		home.navigateToURL("Approach");
		String expected = "https://www.uptake.com/approach";
		String actual = home.getUrl();
		assertTrue(expected.equals(actual));
	}
	
	
	@AfterClass
	public void cleanUpTest(){
		if(home !=null)
			Driver.cleanUp();
	}
	
}
