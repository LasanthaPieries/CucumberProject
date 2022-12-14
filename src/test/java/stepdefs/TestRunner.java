package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		strict = true,
		monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		glue = "stepdefs",
		tags = {"@sanity"}
		//tags = {"@sanity or @regression"}
		)
public class TestRunner {

}
