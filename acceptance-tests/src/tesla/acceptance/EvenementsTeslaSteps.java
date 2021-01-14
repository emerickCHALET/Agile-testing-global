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
import org.openqa.selenium.WebElement;

public class EvenementsTeslaSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^je suis sur la page event$")
    public void je_suis_sur_la_page_event() throws Throwable {

        driver.get("https://www.tesla.com/fr_FR/events");
    }

    @Then("^je remplis le champ prénom avec \"([^\"]*)\"$")
    public void je_remplis_le_champ_prénom_avec(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"edit-firstname-td\"]")).sendKeys(arg1);
    }

    @Then("^je remplis le champ nom avec \"([^\"]*)\"$")
    public void je_remplis_le_champ_nom_avec(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"edit-lastname-td\"]")).sendKeys(arg1);
    }

    @Then("^je remplis le champ téléphone avec \"([^\"]*)\"$")
    public void je_remplis_le_champ_téléphone_avec(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"edit-phonenumber-td\"]")).sendKeys(arg1);
    }

    @Then("^je remplis le champ code postal avec \"([^\"]*)\"$")
    public void je_remplis_le_champ_code_postal_avec(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"edit-phonenumber-td\"]")).sendKeys(arg1);
    }

    @Then("^je click sur \"([^\"]*)\"$")
    public void je_click_sur(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^le message d'erreur apparait$")
    public void le_message_d_erreur_apparait() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^les liens du menus contiennent \"([^\"]*)\" et \"([^\"]*)\"$")
    public void les_liens_du_menus_contiennent_et(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @After
    public void afterScenario() {
        driver.quit();
    }
}
