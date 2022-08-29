package co.com.prueba.llaves.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueballaves.feature",
        glue = "co/com/prueba/llaves/stepdefinitions"
)
public class PruebaLlavesRunner {
}
