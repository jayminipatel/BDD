package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    WebDriver driver;

    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Successfully open Browser");
        Login log = new Login();
    }

    @Given("^Enter an Url$")
    public void enter_an_Url() {
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Correct URL");
    }

    @When("^User click on Register link$")
    public void user_click_on_Register_link() {
        driver.findElement(By.className("ico-register")).click();
        System.out.println("Successfully click on register link");


    }

    @When("^User on Register Page and Verify Register page Title$")
    public void user_on_Register_Page_and_Verify_Register_page_Title() {
        String actualtitle = driver.getTitle();
        String expactedtitle = "nopCommerce demo store. Register";
        if (actualtitle.equals(expactedtitle)) {
            System.out.println("Title page correct");
        } else {
            System.out.println("Title page is incorrect");
        }


    }

    @Then("^User enter Firstname and Lastname and Email and Password and ConfirmPassword and click on Register button$")
    public void user_enter_Firstname_and_Lastname_and_Email_and_Password_and_ConfirmPassword_and_click_on_Register_button() {
        driver.findElement(By.id("FirstName")).sendKeys("Tester");
        driver.findElement(By.id("LastName")).sendKeys("Software");
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        System.out.println("Successfully register");
    }

    @Then("^User is on Home Page and Verify Home page Title$")
    public void user_is_on_Home_Page_and_Verify_Home_page_Title() {
        System.out.println("Correct Home Page");

    }

    @Then("^User close the browse$")
    public void user_close_the_browse()  {
      driver.close();
        System.out.println("close browser");
    }
}


