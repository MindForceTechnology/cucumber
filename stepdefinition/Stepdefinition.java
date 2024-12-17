package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	public ChromeDriver driver;
	    
	    @Given ("Open the Chrome browser")
		public void openbrowser()
		{
	    	driver= new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
	    
	    @And ("Load the URL1S")
	    
		public void  loadURL()
		{
			
			driver.get("https://demo.guru99.com/test/login.html");
		}
	    
	    
		@Given ("Enter the username as {string}")
		public void userName(String username)
		{
			
			
			driver.findElement(By.cssSelector("#email")).sendKeys(username);
			
			}
		
		
		@And ("Enter the password as {string}")
		public void passWord(String password)
		{
			driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
		}
		
		@When ("click on SignIn button")
		public void clickSignIn()
		{
			driver.findElement(By.xpath("//button[@id='SubmitLogin']//span")).click();
		}
		
		
		@Then ("Home page should be display")
		public void successfullySigned()
		{
			System.out.println("SUCCESSFULLY SIGNINED*");
		}
//		@Given ("Open the Chrome browser1")
//		public void openbrowser1()
//		{
//	    	driver= new ChromeDriver();
//			driver.manage().window().maximize();
//			
//		}
//		
//	    
//	    @And ("Load the URL1")
//		public void  loadURL1()
//		{
//			
//			driver.get("https://loginslink.com/guru99-login");
//		}
//	    
//	    
//	    
//	    @And ("Click the Login button option1")
//	    public void ClickLogin1()
//	    {
//	    	driver.findElement(By.xpath("//a[@href='https://loginslink.com/login'][text()='Login']")).click();
//	    	
//	    }
//	    
//	    @And ("Enter the invalid user name as {string}")
//		public void userName1(String username)
//		{
//			
//			driver.findElement(By.cssSelector("#email")).sendKeys(username);	
//		}
//		
//		@And ("Enter the invalid password as {string}")
//		public void passWord1(String password)
//		{
//			driver.findElement(By.xpath("//input[@id='password'][@placeholder='Password']")).sendKeys(password);
//		}
//		@When ("click on Login button")
//		public void clickLogin1() throws InterruptedException
//		{
//			Thread.sleep(4000);
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,4500)");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//div[@class='form-line mb-4']//input[@id='login']")).click();
//		}
//		
//		@But ("Login error message should be displayed")
//		public void invalidLogin()
//		{
//			System.out.println("Error occured login page*");
//			
//		}
//		
//		
		
		
		
		

		


}
