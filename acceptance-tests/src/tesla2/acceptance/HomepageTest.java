package tesla2.acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"../src/tesla2/acceptance"}, // ou se situe votre fichier .feature
        plugin = {"pretty"}
)
public class HomepageTest {

}