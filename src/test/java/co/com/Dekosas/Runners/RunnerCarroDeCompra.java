package co.com.Dekosas.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/carroDeCompra.feature",
        glue = "co.com.Dekosas.StepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerCarroDeCompra {
}
