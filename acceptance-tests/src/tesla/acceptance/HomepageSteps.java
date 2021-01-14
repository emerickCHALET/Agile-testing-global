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

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
             assertTrue(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content").contains(arg1));
        }

        @Then("^la premiere punchline contient \"([^\"]*)\"$")
        public void la_premiere_punchline_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Model S')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^la deuxieme punchline contient \"([^\"]*)\"$")
        public void la_deuxieme_punchline_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Model 3')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^la troisieme punchline contient \"([^\"]*)\"$")
        public void la_troisieme_punchline_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Model X')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^la quatrieme punchline contient \"([^\"]*)\"$")
        public void la_quatrieme_punchline_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Model Y')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^la cinquieme punchline contient \"([^\"]*)\"$")
        public void la_cinquieme_punchline_contient(String arg1) throws Throwable {
            assertTrue(driver.findElements(By.cssSelector("h1.tcl-hero-parallax__heading-color-black")).get(5).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^les liens du menus contiennent \"([^\"]*)\" et \"([^\"]*)\"$")
        public void les_liens_du_menus_contiennent(String arg1, String arg2) throws Throwable {
            assertEquals(driver.findElement(By.xpath("//a[contains(text(), '"+arg1+"' )]")).getAttribute("href"),arg2);
        }

        @Then("^le premier lien contient burger menu contient \"([^\"]*)\"$")
        public void le_premier_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Véhicules ')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le deuxieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_deuxieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElements(By.xpath("//a[contains(text(),'Véhicules ')]")).get(3).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le troisieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_troisieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Reprise')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le quatrieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_quatrieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Cybertruck')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le cinquieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_cinquieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Roadster')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le sixieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_sixieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'Énergie')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le septieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_septieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Essais')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le huitieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_huitieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            String[] tab = arg1.split(" ");
            WebElement tmp = driver.findElement(By.xpath("//a[contains(text(),'Flottes ')]"));
            assertTrue(tmp.getAttribute("innerHTML").contains(tab[0]));
            assertTrue(tmp.getAttribute("innerHTML").contains(tab[2]));
        }

        @Then("^le neuvieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_neuvieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Nous trouver')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le dixieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_dixieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Événements')]")).getAttribute("innerHTML").contains(arg1));
        }

        @Then("^le onzieme lien contient burger menu contient \"([^\"]*)\"$")
        public void le_onzieme_lien_contient_burger_menu_contient(String arg1) throws Throwable {
            assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Assistance')]")).getAttribute("innerHTML").contains(arg1));
        }

    @After
    public void afterScenario() {
        driver.quit();
    }

}

