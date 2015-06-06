package example;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Steps {
    private WebDriver driver = new FirefoxDriver();

    @After
    public void cleanUp() {
        driver.close();
    }

    @Given("^I have access to internet$")
    public void i_have_access_to_internet() {

    }

    @When("^I Access the github home page$")
    public void i_access_the_github_home_page() {
        driver.get("http://github.com");
    }

    @Then("^the page should say github on the title$")
    public void the_page_should_say_github_on_the_title() {
        WebElement headingElement = driver.findElement(By.className("heading"));
        assertThat(headingElement.getText(), containsString("Build"));
    }

}
