package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
                 (features="src/test/resources/Features/test1.feature", 
                 glue="stepDefinitions",
                 dryRun=true,
                 monochrome=true,
                 plugin = {"pretty", 
                		   "html:test-output"}
                 )


public class testRunner {

}
	