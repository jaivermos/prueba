package co.com.choucair.pruebatecnica.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/Utest.features",
                 tags= "@stories",
                glue = "co.com.choucair.pruebatecnica.utest.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class Runner {
}
