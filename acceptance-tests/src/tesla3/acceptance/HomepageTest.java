package tesla3.acceptance;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"tesla3/acceptance"}, // ou se situe votre fichier .feature
        plugin = {"pretty"}
)
public class HomepageTest {
}
