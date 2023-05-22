package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/KS20463914/eclipse-workspace/Trial/src/main/java/Feature/Google.feature"
		,glue= {"BindingsAndhooks"},
		
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report"})
public class runnerclass extends AbstractTestNGCucumberTests{

}
