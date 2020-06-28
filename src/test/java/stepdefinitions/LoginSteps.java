package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {	    
	    System.setProperty("webdriver.chrome.driver", "C:\\JK\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.navigate().to("http://localhost:8080");		
		System.out.println("User is on login page");
		driver.manage().window().maximize();		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("User entered details");
		 
		 driver.findElement(By.id("username")).sendKeys("janakiram.sampalli@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("siri");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		 System.out.println("User clicked login button");
		 
		 driver.findElement(By.id("loginButton")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {		 
		 
		 if(driver.getPageSource().contains("student")) {
			 System.out.println("User redirected to home page");
		 }else {
			 System.out.println("Not on results page");
		 }		 
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		System.out.println("User is on home page");
	}
	
	@When("user clicks add a new student button")
	public void user_clicks_add_a_new_student_button() {		
		driver.findElement(By.id("addStudent")).click();
		System.out.println("User cliked on \"add new student\" button");
	}
		
	@When("enters user name")
	public void enters_user_name() {		
		driver.findElement(By.id("name")).sendKeys("Ram");
		System.out.println("User entered student's name");
	}

	@When("clicks add user button")
	public void clicks_add_user_button() {
		driver.findElement(By.id("addUser")).click();
		System.out.println("User clicked \"add user\" button");
	}

	@Then("new user is listed in the list")
	public void new_user_is_listed_in_the_list() {
		 if(driver.getPageSource().contains("Ram")) {
			 System.out.println("User created successfully.");
		 }else {
			 System.out.println("User creation unsuccessful...");
		 }
		 
		 //driver.close();
		 //driver.quit();
	}
}
