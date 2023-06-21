package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookingClass {
	WebDriver driver;
	@Test(priority=1)
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
	    
		ChromeOptions c = new ChromeOptions();
		   c.addArguments("--remote-allow-origins=*");
		  //  WebDriver driver = new ChromeDriver(c);
		   
		      System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32//geckodriver.exe");
		  driver.get("https://www.expedia.com/");
		  
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	}
	  @Test(priority=2)
	  @And("click on Flights")
	public void click_on_flights() throws InterruptedException {
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[text()=\"Flights\"]")).click();
		    Thread.sleep(3000);
	}
	   @Test(priority=3)
	@Then("click on one way")
	public void click_on_one_way() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@data-cy=\"oneWayTrip\"]")).click();
		 Thread.sleep(3000);
	}
	    @Test(priority=4)
	@Then("click on FROM")
	public void click_on_from() throws InterruptedException {
		 driver.findElement(By.xpath("//span[@class=\"lbl_input latoBold  appendBottom5\"]")).click();
		 Thread.sleep(3000);
	}
	    @Test(priority=5)
	@When("user enter location in serch field")
	public void user_enter_location_in_serch_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
		 Thread.sleep(3000);
	}
	    @Test(priority=6)   
	@Then("select the from location")
	public void select_the_from_location() throws InterruptedException {
		 driver.findElement(By.xpath("//p[text()=\"Mumbai, India\"]")).click();
		    Thread.sleep(1000);
	}
	    @Test(priority=7)
	@Then("click on TO")
	public void click_on_to() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()=\"To\"]")).click();
	    Thread.sleep(3000);
	}
	    @Test(priority=8)
	@When("user enter location into search field")
	public void user_enter_location_into_search_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Chennai");
		Thread.sleep(3000);
	}
	    @Test(priority=9)
	@Then("select the to location")
	public void select_the_to_location() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()=\"Chennai, India\"]")).click();
		Thread.sleep(3000);
	}
	    
	 
	    @Test(priority=11)
	@Then("select departure date")
	public void select_departure_date() throws InterruptedException {
		driver.findElement(By.xpath("//div[@aria-label=\"Tue Jan 31 2023\"] ")).click();
		Thread.sleep(3000);
	}
	    @Test(priority=12)
	    @Then("click on travellers&class")
	    public void click_on_travellers_class() throws InterruptedException {
	        driver.findElement(By.xpath("//label[@for='travellers']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=13)
	    @Then("select passengers")
	    public void select_passengers() throws InterruptedException {
	    	driver.findElement(By.xpath("//li[@data-cy='adults-1']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=14)
	    @Then("click on apply")
	    public void click_on_apply() throws InterruptedException {
	    	driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=15)
	    @And("click on search")
	    public void click_on_search() throws InterruptedException {
	    	driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=16)
	    @Then("click on ok got it")
	    public void click_on_ok_got_it() throws InterruptedException {
	    	
	    	 driver.getWindowHandle();
	    	Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()=\"OKAY, GOT IT!\"]")).click();
	        Thread.sleep(2000);
	        
	    }
	 
	    @Test(priority=17)
	    @Then("click on view prices")
	    public void click_on_view_prices() throws InterruptedException {
	    	driver.findElement(By.xpath("(//span[@title='Non Stop'])[1]")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("(//div[@class='priceSection']//button//span)[1]")).click();
	    	Thread.sleep(3000);
	    }
	    @Test(priority=18)
	    @When("click on first book now")
	    public void click_on_first_book_now() throws InterruptedException {
	    	driver.findElement(By.xpath("(//div[@class=\"viewFareBtnCol \"]//button)[2]")).click();
	        Thread.sleep(5000);
	    }
	    
	    @Test(priority=19)
	    @Then("navigate to child window")
	    public void navigate_to_child_window() throws InterruptedException {
	    	Set<String> windows = driver.getWindowHandles(); 
	        Iterator<String>it = windows.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        	
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;  
	        
	        js.executeScript("window.scrollBy(0,500)",""); 
	        
	        Thread.sleep(3000);
	    }

	  
	    
	    @Test(priority=20)
	    @Then("click on Yes Secure my trip radio button")
	    public void click_on_yes_secure_my_trip_radio_button() throws InterruptedException {
	    	driver.findElement(By.xpath("//b[text()=\"Yes, Secure my trip. \"]")).click();
	        Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor)driver;  		        
	        js.executeScript("window.scrollBy(0,250)",""); 
	        Thread.sleep(1000);        
	        js.executeScript("window.scrollBy(0,250)",""); 
	        
	        Thread.sleep(3000);
	    }
	    @Test(priority=21)
	    @Then("click on add new adult")
	    public void click_on_add_new_adult() throws InterruptedException {
	    	driver.findElement(By.xpath("//button[text()=\"+ ADD NEW ADULT\"]")).click();
	        Thread.sleep(3000);
	    }
	    
	   
	    @Test(priority=22)
	    @Then("enter first name")
	    public void enter_first_name() throws InterruptedException {
	    	driver.findElement(By.xpath("//input[@placeholder=\"First & Middle Name\"]")).sendKeys("John");
	        Thread.sleep(3000);
	    }
	    @Test(priority=23)
	    @And("enter last name")
	    public void enter_last_name() throws InterruptedException {
	    	driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Allen");
	        Thread.sleep(3000);
	    }
	    @Test(priority=24)
	    @And("select gender")
	    public void select_gender() throws InterruptedException {
	    	driver.findElement(By.xpath("(//div[@class='selectTab ']//div//label)[1]")).click();
	    	Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        
	        js.executeScript("window.scrollBy(0,250)",""); 
	        
	        Thread.sleep(3000);
	    }
	    @Test(priority=25)
	    @And("enter phone number")
	    public void enter_phone_number() throws InterruptedException {
	    	driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("9876543210");
	        Thread.sleep(3000);
	    }
	    @Test(priority=26)
	    @And("enter email")
	    public void enter_email() throws InterruptedException {
	    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Johnallen_1234@gmail.com");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[@class='emailId']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=27)
	    @Then("click on continue")
	    public void click_on_continue() throws InterruptedException {
	    	driver.findElement(By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']")).click();
	        Thread.sleep(3000);
	    }
	    @Test(priority=28)
	    @Then("click on confirm button in popup")
	    public void click_on_confirm_button_in_popup() throws InterruptedException {
	    	driver.findElement(By.xpath("//button[@class='button buttonPrimary buttonBig fontSize14']")).click();
	        Thread.sleep(3000);
	        
	    }
	    
	    @Test(priority=29)
	    @Then("click on yes,please button")
	    public void click_on_yes_please_button() throws InterruptedException {
	    	driver.findElement(By.xpath("(//div[@class=\"seatBookOverlayWrap\"]//p//button)[1]")).click();
	    	Thread.sleep(3000);
	    	
	    	JavascriptExecutor js = (JavascriptExecutor)driver;  
	        
	        js.executeScript("window.scrollBy(0,250)",""); 
	    	
	    }
	    
	    @Test(priority=30)
	    @Then("click on contiue button")
	    public void click_on_contiue_button() throws InterruptedException {
	    	 driver.findElement(By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']")).click();
		        Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor)driver;  
		        
		        js.executeScript("window.scrollBy(0,250)",""); 
	    }
	    
	    @Test(priority=31)
	    @Then("click on food continue button")
	    public void click_on_food_continue_button() throws InterruptedException {
	    	 driver.findElement(By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']")).click();
		        Thread.sleep(3000);
	    }
	    @Test(priority=32)
	    @Then("click on continue anyway")
	    public void click_on_continue_anyway() throws InterruptedException {
	    	 driver.findElement(By.xpath("//button[@class='reviewAddonsBtn']")).click();
		        Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor)driver;  
		        
		        js.executeScript("window.scrollBy(0,1000)",""); 
	    }
	
	    @Test(priority=33)
	    @Then("click on proceed to pay")
	    public void click_on_proceed_to_pay() throws InterruptedException {
	    	 driver.findElement(By.xpath("//button[text()='Proceed to pay']")).click();
		        Thread.sleep(3000);
		        driver.quit();
	    }
	    
	    
}
