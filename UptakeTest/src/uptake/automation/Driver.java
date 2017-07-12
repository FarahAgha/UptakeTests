package uptake.automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	//Accessing static instance to use driver for multiple browser
	public static WebDriver instance;
	
	
	public static void initilize(){
		//initialize browser
		initializeFireFox();
		
		//implicit wait
		driverWait();
		
	}
	
	//FireFox Driver setup
	public static void initializeFireFox() {
		
		//setting properties and initializing FireFox
		String path = "C:\\Users\\Deltaman\\Documents\\Uptake\\Resources\\geckodriver-v0.17.0-win32\\";
		System.setProperty("webdriver.gecko.driver",(path+"geckodriver.exe"));
		instance = new FirefoxDriver();
	}

	public static void driverWait() {
		//To add wait to render the page
		instance.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	public static void cleanUp(){
		//cleanup the instance of the driver 
		instance.close();
	}



}
