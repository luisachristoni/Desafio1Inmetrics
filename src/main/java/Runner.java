import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		tags = {"~@ignore"},
		snippets = SnippetType.CAMELCASE, 
		strict = true
		)

public class Runner {

}
