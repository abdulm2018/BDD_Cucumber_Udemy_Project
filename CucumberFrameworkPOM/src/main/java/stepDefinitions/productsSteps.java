package stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class productsSteps extends DriverFactory {
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

	@Given("^User navigates to \"([^\"]*)\" website$")
	public void User_navigates_to_website(String url) throws InterruptedException {
		Thread.sleep(2000);
		getDriver().get(url);

	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void User_clicks_on(String loctor) throws InterruptedException {
		getDriver().findElement(By.cssSelector(loctor)).click();

	}

	@Then("^User should be presented with a promo alert$")
	public void user_should_be_presented_with_a_promo_alert() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();

	}

}
