package stepdefinition3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
public ChromeDriver driver;
	
@Given ("Open the chrome browser")
	public void openApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@And ("Load the URL")
	public void urlOpen() {
		
		driver.get("https://demo.guru99.com/V4/");
	}
	
	@Given ("Enter the user name")
	public void userName() {
		
		driver.findElement(By.name("uid")).sendKeys("mngr595323");
	}
	
	@And ("Enter the password")
	public void passWord() {
		
		driver.findElement(By.name("password")).sendKeys("vAdebut");

	}
	
	@When ("Click on sign in button")
	public void login() {
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Then ("Home page should be displayed")
	public void signIn() {
		System.out.println("Home Page displayed Successfully...");
	}

}


