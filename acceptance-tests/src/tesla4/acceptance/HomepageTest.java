package tesla4.acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"../src/tesla4/acceptance"}, // ou se situe votre fichier .feature
        plugin = {"pretty"}
)
public class HomepageTest {

}