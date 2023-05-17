package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("^User able to Open browser$")
    public void user_able_to_open_Browser() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Successfully open Browser");

    }

    @Given("^Enter an url$")
    public void enter_an_Url() {
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Correct URL");
    }



    @When("^User click on Login Link$")
    public void user_click_on_Login_Link() {

        driver.findElement(By.className("ico-login")).click();
        System.out.println("login link ");
    }

    @When("^User on Login Page and Verify Login page Title$")
    public void user_on_Login_Page_and_Verify_Login_page_Title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login", title);
    }

    @Then("^User enter Email and password and click on login button$")
    public void user_enter_Email_and_password_and_click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    @Then("^User Close the browse$")
    public void user_close_the_browse()  {
        driver.close();
        System.out.println("close browser");
    }


}








