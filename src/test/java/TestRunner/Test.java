package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//Resource//Features",
glue = {"StepDefinition"},
plugin = {"pretty","html:target/htmlreports"})  //for reports not mandatory but above two are mandatory

//It will run as runner TestNG
public class Test extends AbstractTestNGCucumberTests {

}
