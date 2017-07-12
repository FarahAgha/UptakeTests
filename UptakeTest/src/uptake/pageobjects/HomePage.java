package uptake.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uptake.automation.Driver;



public class HomePage {
	private static WebElement element = null;
	
	
	public void init(){
		
		Driver.initilize();	
	}
	
	public void baseURL(){
		
		Driver.instance.manage().window().maximize();
		Driver.instance.get("http://www.uptake.com");
	}

	
	public String getUrl() {
		
		String str = Driver.instance.getCurrentUrl();
		return str;
	}
	
	public void allLinks(){
		
		List<WebElement> links = Driver.instance.findElements(By.tagName("a"));
		
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
	
	public void navigateToURL(String link){
	
		navigate(link).click();
	}
	
	//returns the WebElement related to the Approach link on the homepage
		public static WebElement navigate(String link)//(WebDriver driver)
		{
			String path = "//a[contains(text(),'"+link+"')]";
			element = Driver.instance.findElement(By.xpath(path));
			System.out.println("link_Approach "+Driver.instance.getCurrentUrl());
			return element;
			
		}
		
}


