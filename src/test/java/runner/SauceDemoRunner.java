package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/sauceDemo.feature",
				glue={"stepDefinition"},
				plugin= {"html:Report/Cucumber-report.html"}
				)
public class SauceDemoRunner {

}
