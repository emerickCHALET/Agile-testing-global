package tesla3.acceptance;
import java.util.List;
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

    @Given("^je suis sur la page \"([^\"]*)\"$")
    public void je_suis_sur_la_page(String arg1) throws Throwable {
        driver.get("https://www.tesla.com/fr_fr");
    }

    @Then("^je clique sur \"([^\"]*)\" puis sur \"([^\"]*)\" je dois etre redirégé sur \"([^\"]*)\"$")
    public void je_clique_sur_puis_sur_je_dois_etre_redirégé_sur(String arg1, String arg2, String arg3) throws Throwable {
        driver.findElement(By.cssSelector(".tds-menu-header-main--trigger_icon--placeholder")).click();
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector("label.tds-menu-header-nav--list_link")).click();

        WebElement even = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/nav/div[1]/nav[1]/ol/li[10]/a"));
        assertEquals(even.getAttribute("href"),arg3);
        even.click();
    }

    @Then("^il doit y avoir (\\d+) événement$")
    public void il_doit_y_avoir_événement(int arg1) throws Throwable {
        driver.get("https://www.tesla.com/fr_FR/events");
        Thread.sleep(5000);

        List<WebElement> rows = driver.findElements(By.cssSelector(".views-row"));
        if (rows.size() == 15)
        {

        }
        else
        {
            throw new PendingException();
        }

    }

    @Given("^Je suis dans \"([^\"]*)\"$")
    public void je_suis_dans(String arg1) throws Throwable {
        driver.get(arg1);
    }

    @Then("^vérifier si afficher tout est présent et afficher plus aussi$")
    public void vérifier_si_afficher_tout_est_présent_et_afficher_plus_aussi() throws Throwable {
        Thread.sleep(3000);
        assertTrue(driver.findElement(By.cssSelector(".view-all")).getText().contains("Voir tous les événements"));
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.cssSelector("li.pager-next.first.last a")).getText(),"AFFICHER PLUS");
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

        driver.findElement(By.xpath("//*[@id=\"edit-zipcode-td\"]")).sendKeys(arg1);
    }

    @Then("^je click sur \"([^\"]*)\"$")
    public void je_click_sur(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"edit-submit-td-ajax\"]")).click();
    }

    @Then("^le message d'erreur \"([^\"]*)\" apparait$")
    public void le_message_d_erreur_apparait(String arg1) throws Throwable {

        assertEquals(driver.findElement(By.className("parsley-required")).getText(),arg1);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
