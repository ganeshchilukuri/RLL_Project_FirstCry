package stepdefinitations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
public static WebDriver driver = null;
	
	public static void init() {
	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	}
	

}


