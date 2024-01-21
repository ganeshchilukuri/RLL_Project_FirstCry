package stepdefinitations;


	

import java.io.File;

import java.io.IOException;
import org.testng.Assert;
import java.nio.file.Files;
//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	
	public class LoginStep  {
          WebDriver driver;
         // private static Logger logger = LogManager.getLogger(LoginStep.class);
		@Given("a user is in the LandingPage on Firstcry")
		public void a_user_is_in_the_landing_page_on_firstcry() {
			//logger.info("a user is in the LandingPage on Firstcry");
			 driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.firstcry.com/");
			  String e1 = driver.getTitle();
				String e2 = "Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com";
				Assert.assertEquals(e2,e1);
			  
		}
@When("user click on the login button")
		public void user_click_on_the_login_button() {
	//logger.info("user click on the login button");

	
		    
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
		}
		@When("user enter valid emailid")
		public void user_enter_valid_emailid() throws InterruptedException {
		//	logger.info("user enter valid emailid");
			
			driver.findElement(By.id("lemail")).sendKeys("ganeshchilukuri143@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
		captureScreenshot(driver, "Fail1.png");
		
		
		}
@When("user click on the continue button")

		public void user_click_on_the_continue_button() throws InterruptedException {
	//logger.info("user click on the continue button");
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
		}

		@When("user click the submit button")
		public void user_click_the_submit_button() throws InterruptedException {
		//logger.info("user click the submit button");

			
			Thread.sleep(30000);
			driver.findElement(By.id("verfiedbtn")).click();
		}

		//@Then("user should be logged in successfully")
		public void user_should_be_logged_in_successfully()  throws InterruptedException {
		}
		
		//@When("enter enter invalid emailid taken screenshot")
		//public void enter_enter_invalid_emailid_taken_screenshot() throws InterruptedException {
		//	driver.findElement(By.id("lemail")).sendKeys("ganeshchilukuri146@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
		//	captureScreenshot(driver, "Fail1.png");
		//}
		@When("user should be logged in successfully")
		public void user_should_be_logged_in_successfully1()throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[8]/span[2]/ul/li[17]/span")).click();

			 
		
		}

		//@When("user again go to login page")
		//public void user_again_go_to_login_page() throws InterruptedException {

//			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
		//}
		
		//@When("user again go to login page")
		//public void user_again_go_to_login_page() throws InterruptedException {
			//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
		//}
		  //  @When("enter invalid emailid")
		//public void enter_invalid_emailid() throws InterruptedException {

			//driver.findElement(By.id("lemail")).sendKeys("ganeshchilukuri46@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
		    
		//}

		//@Then("user cant login and screenshot is generated")
		//public void user_cant_login_and_screenshot_is_generated() {
		  //  throw new io.cucumber.java.PendingException();
		//}

		
		
	
	private static void captureScreenshot (WebDriver driver, String fileName) {
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);	   
	    File destinationFile= new File(fileName);
	    try {
	    Files.copy(sourceFile.toPath(), destinationFile.toPath());
	    System.out.println("Screenshot captured:" + destinationFile.getAbsoluteFile());
	    } catch (IOException e) {
	     System.out.println("Unable to capture screenshot: "+e.getMessage());
	    }
		}
	}
		


	