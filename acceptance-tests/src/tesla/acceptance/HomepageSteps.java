package tesla.acceptance;

import java.util.concurrent.TimeUnit;

import java.lang.*;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HomepageSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^je suis sur la homepage$")
    public void je_suis_sur_la_homepage() throws Throwable {
        driver.get("https://www.tesla.com/fr_FR/");
    }

    @Then("^le titre doit être \"([^\"]*)\"$")
    public void le_titre_doit_être(String arg1) throws Throwable {
        assertEquals(driver.getTitle(),arg1);
    }

    @Then("^la description contient \"([^\"]*)\"$")
    public void la_description_contient(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^les punchlines contiennent \"([^\"]*)\"$")
    public void les_punchlines_contiennent(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^les liens du menus contiennent \"([^\"]*)\"$")
    public void les_liens_du_menus_contiennent(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^les liens du burger menu contiennent \"([^\"]*)\"$")
    public void les_liens_du_burger_menu_contiennent(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}

