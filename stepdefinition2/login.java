package stepdefinition2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
//	public ChromeDriver driver;
//
//	@Given("Open the Chrome browser")
//	public void openbrowser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//	}
//
//	@And("Load the URL")
//	public void loadURL() {
//
//		driver.get("https://demo.guru99.com/test/login.html");
//	}
//
//	
//	
//	@Given("user should login as {string} and {string}")
	
//	public void userName(String UserID, String Password) {
//
//		driver.findElement(By.cssSelector("#email")).sendKeys(UserID);
//		driver.findElement(By.cssSelector("#passwd")).sendKeys(Password);
//	}
//
//	@When("click on SignIn button")
//	public void clickSignIn() {
//		driver.findElement(By.xpath("//button[@id='SubmitLogin']//span")).click();
//	}
//
//	@Then("Home page should be display")
//	public void successfullySigned() {
//		System.out.println("SUCCESSFULLY SIGNINED*");
//	}


public ChromeDriver driver;
	
	@Given ("Open the chrome browser")
	public void openBrowse() {
		
		driver = new ChromeDriver();
		
	}
	@And ("Load the URL")
	public void loadURL() {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
	}
	@Given ("User should login as {string} and {string}")
	public void login(String UserID, String Password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(UserID);
		driver.findElement(By.id("passwd")).sendKeys(Password);
	}
	
	@When ("Click on signIn button")
	public void signin() {
		
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	@Then ("Home page should be displayed")
	public void success() {
		
		System.out.println("Email Successfully Logged in...");
	}
	

}

