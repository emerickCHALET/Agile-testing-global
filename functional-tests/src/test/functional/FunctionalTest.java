package test.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class FunctionalTest {

	private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
	    	// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    // Test de la Story #1-homepage (https://trello.com/c/WKTneu9o/1-homepage)
    @Test
    public void testHomepage() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/");
        assertEquals(driver.getTitle(), "Partagez vos passions | Meetup");
        // TODO
        // To Be Completed By Coders From Coding Factory
        String desc = "Partagez vos passions et faites bouger votre ville";
        String desc_1 = "Meetup vous aide à rencontrer des personnes près de chez vous, autour de vos centres d'intérêt.";
        assertTrue(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content").contains(desc));
        assertTrue(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content").contains(desc_1));
        // System.out.println(driver.findElement(By.cssSelector("h1.exploreHome-hero-mainTitle text--display align--center>span"),"Le monde vous tend les bras"));
        assertEquals(driver.findElement(By.tagName("h1")).getText(),"Le monde vous tend les bras");
        assertEquals(driver.findElement(By.className("exploreHome-hero-subTitle")).getText(),"Rejoignez un groupe local pour rencontrer du monde, tester une nouvelle activité ou partager vos passions.");
        assertEquals(driver.findElement(By.cssSelector("#joinMeetupButton")).getText(),"Rejoindre Meetup");
        assertEquals(driver.findElement(By.cssSelector("#joinMeetupButton")).getAttribute("href"),"https://www.meetup.com/fr-FR/register/");
  }

    // Test de la Story n ...
    // TODO
    // To Be Completed By Coders From Coding Factory
    @Test
    public void testJobs() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/careers/");
        // TODO
        // To Be Completed By Coders From Coding Factory
        assertEquals(driver.findElement(By.cssSelector("p.insetParagraph")).getText(),"Join our team, find your people");
        assertEquals(driver.findElement(By.cssSelector("a.jobsBanner")).getText(),"Explore Opportunities");
        assertEquals(driver.findElement(By.cssSelector("a._stayInTouch-module_clickable__3g3mA")).getAttribute("href"),"https://www.meetup.com/careers/all-opportunities");
        assertEquals(driver.findElement(By.cssSelector("p._perksAndBenefits-module_isTitle__1-YvW")).getText(),"Perks and benefits");
    }

    @Test
    public void testRecherchepage() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/promenades-et-randonnees/?_locale=fr-FR");
		assertNotNull(driver.findElement(By.className("groupHomeHeader-groupNameLink")).getAttribute("href"));
        assertNotNull(driver.findElement(By.className("groupHomeHeader-groupNameLink")).getText());
        assertEquals(driver.findElement(By.className("groupHomeHeaderInfo-cityLink")).getText(),"Paris, France");
        assertEquals(driver.findElement(By.className("groupHomeHeaderInfo-cityLink")).getAttribute("href"),"https://www.meetup.com/fr-FR/cities/fr/paris/");
        assertNotNull(driver.findElement(By.cssSelector("a[href='/fr-FR/promenades-et-randonnees/members/']")).getText());
        assertEquals(driver.findElement(By.className("orgInfo-name-superGroup")).getAttribute("href"),"https://www.meetup.com/fr-FR/promenades-et-randonnees/members/?op=leaders");
        assertEquals(driver.findElement(By.className("groupPrimaryAction")).getText(), "Rejoindre ce groupe");
        assertNotNull(driver.findElement(By.className("groupHomeHeader-banner")).getAttribute("style"));

        String liElements = driver.findElement(By.cssSelector("[class='inlineblockList']")).getText();
        assertTrue(liElements.contains("À propos"));
        assertTrue(liElements.contains("Événements"));
        assertTrue(liElements.contains("Membres"));
        assertTrue(liElements.contains("Photos"));
        assertTrue(liElements.contains("Discussions"));
        assertTrue(liElements.contains("Plus"));

        assertNotNull(driver.findElement(By.className("groupHome-eventsList-pastEventsLink")).getAttribute("href"));
        assertNotNull(driver.findElement(By.className("groupHome-eventsList-upcomingEventsLink")).getAttribute("href"));
        assertNotNull(driver.findElement(By.className("groupMembers-memberListLink")).getText());
        assertNotNull(driver.findElement(By.className("avatar--person")).getAttribute("style"));

        //Si aucun prochain meetup n'est prévu, un bandeau doit apparaitre à la place indiquant ce message en titre: Quel sera notre prochain Meetup ?

        driver.findElement(By.className("groupPrimaryAction")).click();
        assertNotNull(driver.findElement(By.cssSelector("a[href*='https://www.facebook.com/']")));
        assertNotNull(driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/']")));
        assertNotNull(driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/']")));
        assertNotNull(driver.findElement(By.cssSelector("a[href*='https://appleid.apple.com/']")));
        assertNotNull(driver.findElement(By.cssSelector("a[href*='/register/']")));
        assertNotNull(driver.findElement(By.cssSelector("a[href*='https://www.meetup.com/']")));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
