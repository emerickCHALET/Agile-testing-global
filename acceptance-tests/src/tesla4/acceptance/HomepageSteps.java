package tesla4.acceptance;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Then("^les caractere son \"([^\"]*)\" et \"([^\"]*)\" et \"([^\"]*)\" et \"([^\"]*)\"$")
    public void les_caractere_son_et_et_et(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/ul/li[8]")).click();
        Thread.sleep(3000);
        if (arg1.equals("Performance"))
        {
            driver.findElement(By.cssSelector("#tesla-spec-showcase-74-1")).click();
            Thread.sleep(3000);
            assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[1]/div[2]/ul/li[1]/span[2]")).getAttribute("innerHTML").replaceAll("&nbsp;"," "),arg2);
            assertThat(driver.findElement(By
                    .xpath("//*[@id='tesla-spec-showcase-74-1-panel']/div[1]/ul/li[2]"))
                    .getAttribute("innerHTML")
                    .replaceAll("&nbsp;"," "),containsString(arg3));
            Thread.sleep(3000);
            assertEquals(driver.findElement(By
                    .xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[1]/div[1]/ul/li[3]/span[2]"))
                    .getAttribute("innerHTML"),arg4);
        }
        else if (arg1.equals("Grande Automonie AWD"))
        {
            driver.findElement(By.cssSelector("#tesla-spec-showcase-74-2")).click();
            Thread.sleep(3000);
            assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[2]/div[2]/ul/li[1]/span[2]"))
                    .getAttribute("innerHTML")
                    .replaceAll("&nbsp;"," "),arg2);
            assertThat(driver.findElement(By
                    .xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[2]/div[1]/ul/li[2]"))
                    .getAttribute("innerHTML")
                    .replaceAll("&nbsp;"," "),containsString(arg3));
            Thread.sleep(3000);
            assertEquals(driver.findElement(By
                    .xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[2]/div[1]/ul/li[3]/span[2]"))
                    .getAttribute("innerHTML"),arg4);
        }
        else if (arg1.equals("Standard Plus"))
        {
            driver.findElement(By.cssSelector("#tesla-spec-showcase-74-3")).click();
            Thread.sleep(3000);
            assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[3]/div[2]/ul/li[1]/span[2]"))
                    .getAttribute("innerHTML")
                    .replaceAll("&nbsp;"," "),arg2);
            assertThat(driver.findElement(By
                    .xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[3]/div[1]/ul/li[2]"))
                    .getAttribute("innerHTML")
                    .replaceAll("&nbsp;"," "),containsString(arg3));
            Thread.sleep(3000);
            assertEquals(driver.findElement(By
                    .xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div/section[8]/div/section/div/div[2]/div/div/section[3]/div[1]/ul/li[3]/span[2]"))
                    .getAttribute("innerHTML"),arg4);
        }
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
