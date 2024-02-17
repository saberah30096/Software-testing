package testrunner_1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/C_Features"},
plugin = {"json:target/cucumber.json"},
glue = "stepdifinition_1")//tags = {"@Jahan1"})

public class C_Testrunner_1 extends AbstractTestNGCucumberTests {

}

