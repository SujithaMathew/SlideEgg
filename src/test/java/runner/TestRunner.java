package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="stepDefinitions",monochrome=true,plugin= {"pretty","html:target","json:target/report.jason"})
public class TestRunner {

}
