package uptake.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	//returns the WebElement related to the Approach link on the homepage
	public static WebElement link_Approach(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[contains(text(),'Approach')]"));
		return element;
		
	}
	
	
	
	
}
