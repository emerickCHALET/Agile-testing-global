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
        public void les_liens_du_menus_contiennent_et(String arg1, String arg2) throws Throwable {
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

    @Given("^je suis sur le modelS$")
    public void je_suis_sur_le_modelS() throws Throwable {

        driver.get("https://www.tesla.com/fr_fr/models");
    }

    @Then("^je click sur le bouton commander avec lurl \"([^\"]*)\"$")
    public void je_click_sur_le_bouton_commander_avec_lurl(String arg1) throws Throwable {

        assertEquals(driver.findElement(By.xpath("//*[@id=\"tesla-hero-showcase-1166\"]/div/div[1]/div/div[2]/div/div[6]/a")).getAttribute("href"),arg1);
        driver.findElement(By.xpath("//*[@id=\"tesla-hero-showcase-1166\"]/div/div[1]/div/div[2]/div/div[6]/a")).click();
    }
    @Given("^je suis sur Model S$")
    public void je_suis_sur_Model_S() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr/models/design");
    }

    @Then("^le prix affiché en LOA est de \"([^\"]*)\"$")
    public void le_prix_affiché_en_LOA_est_de(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.cssSelector(".finance-item--price.finance-item--price-before-savings")).getText(),arg1);

    }

    @Given("^je suis sur le model S$")
    public void je_suis_sur_le_model_S() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr/models/design");
    }

    @Then("^Le prix affiché  est de \"([^\"]*)\"$")
    public void le_prix_affiché_est_de(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/p")).getText(),arg1);

    }

    @Then("^Quand je click sur \"([^\"]*)\"$")
    public void quand_je_click_sur(String arg1) throws Throwable {
        driver.findElement(By.cssSelector(".finance-content--modal")).click();
    }

    @Then("^Le prix du montant total avec achat au terme du contrat de \"([^\"]*)\"$")
    public void le_prix_du_montant_total_avec_achat_au_terme_du_contrat_de(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//*[@id=\"totalLeaseAmount\"]")).getAttribute("value"),arg1);
    }

    @Given("^je suis sur commander Model S$")
    public void je_suis_sur_commander_Model_S() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr/models/design");
    }

    @When("^je click sur Performance \"([^\"]*)\"$")
    public void je_click_sur_Performance(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]")).click();
        Thread.sleep(10000);
    }

    @Then("^le prix affiché en LOA PERFORMANCE est de \"([^\"]*)\"$")
    public void le_prix_affiché_en_LOA_PERFORMANCE_est_de(String arg1) throws Throwable {
        Thread.sleep(10000);
        assertEquals(driver.findElement(By.cssSelector(".finance-item--price.finance-item--price-before-savings")).getText(),arg1);
    }

    @Then("^Le prix affiché est \"([^\"]*)\"$")
    public void le_prix_affiché_est(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/p")).getText(),arg1);

    }

    @Then("^Quand je click sur le bouton \"([^\"]*)\"$")
    public void quand_je_click_sur_le_bouton(String arg1) throws Throwable {
        driver.findElement(By.cssSelector(".finance-content--modal")).click();
    }

    @Then("^Le prix du montant total avec achat au terme du contrat est alors de \"([^\"]*)\"$")
    public void le_prix_du_montant_total_avec_achat_au_terme_du_contrat_est_alors_de(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//*[@id=\"totalLeaseAmount\"]")).getAttribute("value"),arg1);
    }

    @Given("^je suis sur commander ModelS$")
    public void je_suis_sur_commander_ModelS() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr/models/design");
    }

    @When("^je click sur \"([^\"]*)\"$")
    public void je_click_sur(String arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/ul/li[4]")).click();
    }

    @Then("^je click sur l'option \"([^\"]*)\"$")
    public void je_click_sur_l_option(String arg1) throws Throwable {

        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]")).click();
    }

    @Then("^le prix affiché en LOA est alors de \"([^\"]*)\"$")
    public void le_prix_affiché_en_LOA_est_alors_de(String arg1) throws Throwable {

        assertEquals(driver.findElement(By.cssSelector(".finance-item--price.finance-item--price-before-savings")).getText(),arg1);
    }

    @Given("^je suis sur la page  model S$")
    public void je_suis_sur_la_page_model_S() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr/models/");
    }

    @Then("^je configure mon modèle S$")
    public void je_configure_mon_modèle_S() throws Throwable {
        driver.findElement(By.cssSelector("a[href='https://www.tesla.com/fr_fr/']")).click();
        Thread.sleep(3000);
    }

    @Then("^je clic donc sur le logo en haut à gauche de la page puis en bas de page sur le lien Localisations j'arrive sur la page dont l'url est : \"([^\"]*)\"$")
    public void je_clic_donc_sur_le_logo_en_haut_à_gauche_de_la_page_puis_en_bas_de_page_sur_le_lien_Localisations_j_arrive_sur_la_page_dont_l_url_est(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("a.tds-menu-header-main--logo")).click();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/fr_fr/");

        driver.findElement(By.tagName("body")).click();
        driver.findElement(By.tagName("body")).sendKeys(Keys.END);
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a[href='/fr_fr/findus/list']")).click();
        System.out.println(driver.getCurrentUrl());

    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}

