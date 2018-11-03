package stepDefinitions;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class condactusSteps extends DriverFactory {
//	WebDriver driver;
//
//	@Before()
//	public void setup() throws IOException {
//		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath()
//				+ "\\src\\test\\java\\resources\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
//	}
//
//	@After()
//	public void teardowm() {
//		this.driver.manage().deleteAllCookies();
//		this.driver.quit();
//	}
//
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws Throwable {
		getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

	}

	@When("^I enter a valid firstname$")
	 public void i_enter_a_valid_firstname() throws InterruptedException {
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("input[name='first_name']")).sendKeys("Tom");
		}

	@When("^I enter a valid Lastname$")
	public void i_enter_a_valid_lastname(DataTable dataTable){
		List<List<String>> data = dataTable.raw();
		
		getDriver().findElement(By.cssSelector("input[name='last_name']")).sendKeys(data.get(0).get(1));
	}

	@And("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		getDriver().findElement(By.cssSelector("input[name='email']")).sendKeys("webdriveruniversity@outlook.com");

	}

	@And("^I enter comments$")
	public void i_enter_comments(DataTable dataTable){
		List<List<String>> data = dataTable.raw();
		
		getDriver().findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(0));
		getDriver().findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(1));
		
	}
	
//	I am using Xpath here: "//input[@value='SUBMIT']"

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		getDriver().findElement(By.xpath("//input[@value='SUBMIT']")).click();

	}

	@Then("^The information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws InterruptedException {
		//		Thank You for your Message!
		
		Thread.sleep(3000);
		
//		Xpath: ".//*[@id='contact_reply']/h1"
		
		WebElement thankscontactuspage =driver.findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		
//		expected actual
		Assert.assertEquals("thankyouforyourmessage!", thankscontactuspage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		
		}

}
