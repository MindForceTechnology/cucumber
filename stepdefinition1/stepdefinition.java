package stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
//	public ChromeDriver driver;
//	@Given("Open the chrome browser")
//	public void openbrowser()
//	{
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		}
//	@And("Load the URL")
//	public void URL()
//	{
//		driver.get("https://demo.guru99.com/V4/");
//		
//		}
//	@Given("Enter the Username")
//	public void username()
//	{
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr570538");
//	}
//	@And("Enter the Password")
//	public void password()
//	{
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("uzerypU");	
//	}
//
//	@When("Click on sign in button")
//	public void login()
//	{
//	driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
//	}
//	@Then("Home page should be displayed")
//	public void signedin()
//	{
//		System.out.println("successfully signedin");
//	}

//	@Given("Open the chrome browser1")
//	public void openbrowser1()
//	{
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		}
//	@And("Load the URL1")
//	public void URL1()
//	{
//		driver.get("https://demo.guru99.com/V4/");
//		
//		}
//	@Given("Enter the inavlid Username {string}")
//	public void username1(String username)
//	{
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
//	}
//	@And("Enter the invalid Password {string}")
//	public void password1(String password)
//	{
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);	
//	}
//
//	@When("Click on sign in button")
//	public void login1()
//	{
//	driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
//	}
//	@Then("Home page should not be displayed")
//	public void signedin1()
//	{
//		System.out.println("error mesaage displayed");
//	}
	public ChromeDriver obj;
	@Given("Login to chromedriver")
	public void chrome() {
	obj = new ChromeDriver();
	}
	
	@And("Login to URL")
	public void URL() {
		obj.get("https://demo.guru99.com/V4/");
	}
	
	@Given("Enter User name")
	public void UN() {
		obj.findElement(By.name("uid")).sendKeys("mngr598470");
	}
	
		@And("Enter PWD")
		public void PWD() {
			obj.findElement(By.name("password")).sendKeys("Vanisri");
		}
			
			@When("Click on Submit")
			public void Sub() {
				obj.findElement(By.name("btnLogin")).click();
			}
				
				@Then("Home page navigation")
				public void homepage() {
					System.out.println("Home should not be display");
			}
		
}

	
	

