package uptake.automation;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import uptake.pageobjects.HomePage;

public class Driver {
	
	public static WebDriver driver;
	
	public void init(){
		String path = "C:\\Users\\Deltaman\\Documents\\Uptake\\Resources\\geckodriver-v0.17.0-win32\\";
		System.setProperty("webdriver.gecko.driver",(path+"geckodriver.exe"));
		driver = new FirefoxDriver();
	}
	
	public void go(){ 
		
		driver.manage().window().maximize();
		driver.get("http://www.uptake.com");
			
	}

	public String getUrl() {
		String str = driver.getCurrentUrl();
		return str;
	}
	
	public void allLinks(){
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		try {
		for (WebElement myElement : links){
			String link = myElement.getText();
			if (link !=""){
	             myElement.click();
	             
					Thread.sleep(2000);
				} 
			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void navigateToURL(){
		//WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Approach')]"));
		
		//link.click();
		HomePage.link_Approach(driver).click();
		
	}



}
